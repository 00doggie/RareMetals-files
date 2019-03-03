package com.doggie.RhoduimMod.creativetabs;
import com.doggie.RhoduimMod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RareMetalsTab extends CreativeTabs {


public RareMetalsTab() 
{
	super("RareMetals");
}

@Override
public ItemStack getTabIconItem() 
{
	return new ItemStack(ModBlocks.RHODUIM_BLOCK);//ItemInit.COPPER_INGOT);
}
}