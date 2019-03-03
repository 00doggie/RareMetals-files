package com.doggie.RhoduimMod.init;

import java.util.ArrayList;
import java.util.List;


import com.doggie.RhoduimMod.blocks.BlockBlastFurnace;
import com.doggie.RhoduimMod.blocks.DarkRubyBlock;
import com.doggie.RhoduimMod.blocks.DarkRubyOre;

import com.doggie.RhoduimMod.blocks.ElectriteOre;
import com.doggie.RhoduimMod.blocks.OsmiumBlock;
import com.doggie.RhoduimMod.blocks.RhoduimBlock;


import net.minecraft.block.Block;

import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber
public class ModBlocks 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RHODUIM_BLOCK = new RhoduimBlock("rhoduim_block", Material.IRON);
	public static final Block OSMIUM_BLOCK = new OsmiumBlock("osmium_block", Material.IRON);
	public static final Block RHODUIM_ORE = new RhoduimBlock("rhoduim_ore", Material.ROCK);
	public static final Block DARKRUBY_ORE = new DarkRubyOre("darkruby_ore", Material.ROCK);
	public static final Block DARKRUBY_BLOCK = new DarkRubyBlock("darkruby_block", Material.IRON);
	public static final Block ELACTRITE_ORE = new ElectriteOre("elactrite_ore", Material.ROCK);
	public static final Block ELACTRITE_BLOCK = new ElectriteOre("elactrite_block", Material.IRON);
	public static final Block BLAST_FURNACE = new BlockBlastFurnace("blast_furnace", Material.IRON);
	@SubscribeEvent

    public static void registerBlocks(RegistryEvent.Register<Block> event) {
}
}

	

