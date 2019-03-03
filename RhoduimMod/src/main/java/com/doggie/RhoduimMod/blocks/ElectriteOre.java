package com.doggie.RhoduimMod.blocks;

import java.util.Random;

import com.doggie.RhoduimMod.init.ModBlocks;
import com.doggie.RhoduimMod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;



public class ElectriteOre  extends BlockBase 
{

	public ElectriteOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(7.0F);
		setResistance(20.0F);
		setHarvestLevel("pickaxe", 3);
		
		
		
	}
	
	public Block getBlockDropped(IBlockState state, Random rand,int fortune) {
		return ModBlocks.ELACTRITE_ORE;
	
		
	
		
	}

}