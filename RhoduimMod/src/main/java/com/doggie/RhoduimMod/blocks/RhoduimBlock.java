package com.doggie.RhoduimMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RhoduimBlock  extends BlockBase 
{

	public RhoduimBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(6.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 3);
		
		
		
	}

}
