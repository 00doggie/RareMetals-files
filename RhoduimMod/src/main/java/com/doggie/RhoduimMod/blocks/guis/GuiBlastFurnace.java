package com.doggie.RhoduimMod.blocks.guis;

import com.doggie.RhoduimMod.blocks.containers.ContainerBlastFurnace;
import com.doggie.RhoduimMod.blocks.tileentities.TileEntityBlastFurnace;
import com.doggie.RhoduimMod.util.Reference;

import net.minecraft.client.gui.inventory.GuiContainer;

import net.minecraft.client.renderer.GlStateManager;

import net.minecraft.entity.player.InventoryPlayer;

import net.minecraft.util.ResourceLocation;



public class GuiBlastFurnace extends GuiContainer

{

	private static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/gui/blast_furnace.png");

	private final InventoryPlayer player;

	private final TileEntityBlastFurnace tileentity;

	

	public GuiBlastFurnace(InventoryPlayer player, TileEntityBlastFurnace tileentity) 

	{

		super(new ContainerBlastFurnace(player, tileentity));

		this.player = player;

		this.tileentity = tileentity;

	}

	

	@Override

	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) 

	{

		String tileName = this.tileentity.getDisplayName().getUnformattedText();

		this.fontRenderer.drawString(tileName, (this.xSize / 2 - this.fontRenderer.getStringWidth(tileName) / 2) + 3, 8, 4210752);

		

	}

	

	@Override

	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)

	{

		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);

		this.mc.getTextureManager().bindTexture(TEXTURES);

		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);

		

		if(TileEntityBlastFurnace.isBurning(tileentity))

		{

			int k = this.getBurnLeftScaled(13);

			this.drawTexturedModalRect(this.guiLeft + 8, this.guiTop + 54 + 12 - k, 176, 12 - k, 14, k + 1);

		}

		

		int l = this.getCookProgressScaled(24);

		this.drawTexturedModalRect(this.guiLeft + 44, this.guiTop + 36, 176, 14, l + 1, 16);

	}

	

	private int getBurnLeftScaled(int pixels)

	{

		int i = this.tileentity.getField(4);

		if(i == 0) i = 200;

		return this.tileentity.getField(0) * pixels / i;

	}

	

	private int getCookProgressScaled(int pixels)

	{

		int i = this.tileentity.getField(1);

		int j = this.tileentity.getField(5);

		return j != 0 && i != 0 ? i * pixels / j : 0;

	}

}
