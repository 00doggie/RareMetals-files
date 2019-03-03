package com.doggie.RhoduimMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DarkRubyBlock  extends BlockBase 
{

	public DarkRubyBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(3.5F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		
		
		
	}

}
