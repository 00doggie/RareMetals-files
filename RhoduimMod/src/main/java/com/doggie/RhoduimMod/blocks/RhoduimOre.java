package com.doggie.RhoduimMod.blocks;

import com.doggie.RhoduimMod.init.ModBlocks;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;




public class RhoduimOre
  extends BlockBase
{
  public RhoduimOre(String name, Material material)
  {
    super(name, material);
    
    setSoundType(SoundType.STONE);
    setHardness(3.5F);
    setResistance(20.0F);
    setHarvestLevel("pickaxe", 2);
  }
  


  public Block getBlockDropped(IBlockState state, Random rand, int fortune)
  {
    return ModBlocks.RHODUIM_ORE;
  }
}