package com.doggie.RhoduimMod.Tabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RareMetalsTab  extends CreativeTabs
 {
	public RareMetalsTab(String label)
	{
		super(label);

	}
	public net.minecraft.item.ItemStack func_78016_d() {
	    return new net.minecraft.item.ItemStack(com.doggie.RhoduimMod.init.ModBlocks.RHODUIM_BLOCK);

}
	@Override
	public ItemStack getTabIconItem() {
		// TODO Auto-generated method stub
		return null;
	}
}