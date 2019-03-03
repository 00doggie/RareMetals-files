package com.doggie.RhoduimMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class EalctriteBlock  extends BlockBase 
{

	public EalctriteBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(7.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 3);
		
		
		
	}

}
