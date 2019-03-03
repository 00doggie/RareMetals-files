package com.doggie.RhoduimMod.util.handlers;

import com.doggie.RhoduimMod.Main;
import com.doggie.RhoduimMod.init.ModBlocks;
import com.doggie.RhoduimMod.init.ModItems;
import com.doggie.RhoduimMod.util.IHasModel;

import net.minecraft.block.Block;

import net.minecraft.enchantment.Enchantment;

import net.minecraft.item.Item;

import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraftforge.event.RegistryEvent;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import net.minecraftforge.fml.common.network.NetworkRegistry;



@EventBusSubscriber

public class RegistryHandler 

{

	@SubscribeEvent

	public static void registerItems(RegistryEvent.Register<Item> event)

	{

		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));

	}

	

	@SubscribeEvent

	public static void registerBlocks(RegistryEvent.Register<Block> event)

	{

		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));

		TileEntityHandler.registerTileEntities();

		

	}

	

	@SubscribeEvent

	public static void registerEnchantment(RegistryEvent.Register<Enchantment> event)

	{

		

	}

	

	@SubscribeEvent

	public static void registerModels(ModelRegistryEvent event)

	{		

		Main.proxy.registerModel(Item.getItemFromBlock(ModBlocks.BLAST_FURNACE), 0);

		

		for(Item item : ModItems.ITEMS)

		{

			if(item instanceof IHasModel)

			{

				((IHasModel)item).registerModels();

			}

		}

		

		for(Block block : ModBlocks.BLOCKS)

		{

			if(block instanceof IHasModel)

			{

				((IHasModel)block).registerModels();

			}

		}

	}

	

	public static void preInitRegistries(FMLPreInitializationEvent event)

	{

		

		

		

	}

	

	public static void initRegistries(FMLInitializationEvent event)

	{

		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());

	

	}

	

	public static void postInitRegistries(FMLPostInitializationEvent event)

	{

	

	}

	

	public static void serverRegistries(FMLServerStartingEvent event)

	{


	}

}