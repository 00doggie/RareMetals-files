package com.doggie.RhoduimMod.blocks.containers;

import com.doggie.RhoduimMod.blocks.BlockBlastFurnace;
import com.doggie.RhoduimMod.blocks.machines.slots.SlotBlastFurnaceFuel;
import com.doggie.RhoduimMod.blocks.machines.slots.SlotBlastFurnaceOutput;
import com.doggie.RhoduimMod.blocks.recipes.BlastFurnaceRecipes;
import com.doggie.RhoduimMod.blocks.tileentities.TileEntityBlastFurnace;

import net.minecraft.entity.player.EntityPlayer;

import net.minecraft.entity.player.InventoryPlayer;

import net.minecraft.inventory.Container;

import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

import net.minecraft.item.ItemStack;

import net.minecraftforge.fml.relauncher.Side;

import net.minecraftforge.fml.relauncher.SideOnly;

import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraftforge.items.IItemHandler;

import net.minecraftforge.items.SlotItemHandler;



public class ContainerBlastFurnace extends Container
{
    private final IInventory tileentityBlastFurnace;
    private int cookTime;
    private int totalCookTime;
    private int furnaceBurnTime;
    private int currentItemBurnTime;
    
    public ContainerBlastFurnace(InventoryPlayer player, TileEntityBlastFurnace tileentity) 
    {
        this.tileentityBlastFurnace = tileentity;
        this.addSlotToContainer(new Slot(tileentity, 0, 55, 18));

		this.addSlotToContainer(new Slot(tileentity,2, 55, 55));
		
		this.addSlotToContainer(new SlotBlastFurnaceOutput(player.player, tileentity, 1, 111, 18));

		this.addSlotToContainer(new SlotBlastFurnaceFuel(tileentity, 4, 83, 64));

		this.addSlotToContainer(new SlotBlastFurnaceOutput(player.player, tileentity, 3, 111, 55));

        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(player, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (int k = 0; k < 9; ++k)
        {
            this.addSlotToContainer(new Slot(player, k, 8 + k * 18, 142));
        }
    }

    public void addListener(IContainerListener listener)
    {
        super.addListener(listener);
        listener.sendAllWindowProperties(this, this.tileentityBlastFurnace);
    }

    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();

        for (int i = 0; i < this.listeners.size(); ++i)
        {
            IContainerListener icontainerlistener = this.listeners.get(i);

            if (this.cookTime != this.tileentityBlastFurnace.getField(1))
            {
                icontainerlistener.sendWindowProperty(this, 1, this.tileentityBlastFurnace.getField(1));
            }

            if (this.furnaceBurnTime != this.tileentityBlastFurnace.getField(0))
            {
                icontainerlistener.sendWindowProperty(this, 0, this.tileentityBlastFurnace.getField(0));
            }

            if (this.currentItemBurnTime != this.tileentityBlastFurnace.getField(4))
            {
                icontainerlistener.sendWindowProperty(this, 4, this.tileentityBlastFurnace.getField(4));
            }

            if (this.totalCookTime != this.tileentityBlastFurnace.getField(5))
            {
                icontainerlistener.sendWindowProperty(this, 5, this.tileentityBlastFurnace.getField(5));
            }
        }

        this.cookTime = this.tileentityBlastFurnace.getField(1);
        this.furnaceBurnTime = this.tileentityBlastFurnace.getField(0);
        this.currentItemBurnTime = this.tileentityBlastFurnace.getField(4);
        this.totalCookTime = this.tileentityBlastFurnace.getField(5);
    }

    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int data)
    {
        this.tileentityBlastFurnace.setField(id, data);
    }

    /**
     * Determines whether supplied player can use this container
     */
    public boolean canInteractWith(EntityPlayer playerIn)
    {
        return this.tileentityBlastFurnace.isUsableByPlayer(playerIn);
    }

    /**
     * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player
     * inventory and the other inventory(s).
     */
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
    {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack())
        {
            ItemStack input = slot.getStack();
            itemstack = input.copy();

            if (index == 1 && index == 5)
            {
                if (!this.mergeItemStack(input, 5, 39, true))
                {
                    return ItemStack.EMPTY;
                }

                slot.onSlotChange(input, itemstack);
            }
            else if (index != 1 && index != 0 && index != 4 && index != 5)
            {
                if (!BlastFurnaceRecipes.instance().getBlastResult(input).isEmpty())
                {
                    if (!this.mergeItemStack(input, 0, 4, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if (TileEntityBlastFurnace.isItemFuel(input))
                {
                    if (!this.mergeItemStack(input, 4, 1, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if (index >= 5 && index < 30)
                {
                    if (!this.mergeItemStack(input, 30, 39, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if (index >= 30 && index < 39 && !this.mergeItemStack(input, 4, 30, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (!this.mergeItemStack(input, 30, 39, false))
            {
                return ItemStack.EMPTY;
            }

            if (input.isEmpty())
            {
                slot.putStack(ItemStack.EMPTY);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (input.getCount() == itemstack.getCount())
            {
                return ItemStack.EMPTY;
            }

            slot.onTake(playerIn, input);
        }

        return itemstack;
    }
}
