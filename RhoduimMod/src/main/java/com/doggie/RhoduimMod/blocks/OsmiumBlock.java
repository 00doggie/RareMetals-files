package com.doggie.RhoduimMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class OsmiumBlock  extends BlockBase 
{

	public OsmiumBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(25.0F);
		setHarvestLevel("pickaxe", 2);
		
		
		
	}

}
