package com.doggie.RhoduimMod.util.handlers;

import com.doggie.RhoduimMod.blocks.tileentities.TileEntityBlastFurnace;
import com.doggie.RhoduimMod.util.Reference;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.common.registry.GameRegistry;



public class TileEntityHandler 

{

	public static void registerTileEntities()

	{

		GameRegistry.registerTileEntity(TileEntityBlastFurnace.class, new ResourceLocation(Reference.MOD_ID + ":blast_furnace"));

		

	}

}