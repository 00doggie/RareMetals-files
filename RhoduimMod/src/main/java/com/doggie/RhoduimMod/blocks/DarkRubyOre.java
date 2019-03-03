package com.doggie.RhoduimMod.blocks;

import java.util.Random;

import com.doggie.RhoduimMod.init.ModBlocks;
import com.doggie.RhoduimMod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;



public class DarkRubyOre  extends BlockBase 
{

	public DarkRubyOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(20.0F);
		setHarvestLevel("pickaxe", 1);
		
		
		
	}
	
	public Item getItemDropped(IBlockState state, Random rand,int fortune) {
		return ModItems.DARKRUBY;
	
		}
	@Override
	public int quantityDropped(Random rand) {
		int max = 4;
		int min = 1;
		return rand.nextInt(max) + min;
}
}
