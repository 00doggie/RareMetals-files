package com.doggie.RhoduimMod.util.handlers;

import com.doggie.RhoduimMod.blocks.containers.ContainerBlastFurnace;
import com.doggie.RhoduimMod.blocks.guis.GuiBlastFurnace;
import com.doggie.RhoduimMod.blocks.tileentities.TileEntityBlastFurnace;
import com.doggie.RhoduimMod.util.Reference;

import net.minecraft.entity.player.EntityPlayer;

import net.minecraft.util.math.BlockPos;

import net.minecraft.world.World;

import net.minecraftforge.fml.common.network.IGuiHandler;



public class GuiHandler implements IGuiHandler

{

	@Override

	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 

	{

		if(ID == Reference.GUI_BLAST_FURNACE) return new ContainerBlastFurnace(player.inventory, (TileEntityBlastFurnace)world.getTileEntity(new BlockPos(x,y,z)));

		

		return null;

	}

	

	@Override

	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 

	{

		if(ID == Reference.GUI_BLAST_FURNACE) return new GuiBlastFurnace(player.inventory, (TileEntityBlastFurnace)world.getTileEntity(new BlockPos(x,y,z)));


		return null;

	}

}
