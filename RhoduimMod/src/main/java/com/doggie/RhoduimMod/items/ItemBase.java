package com.doggie.RhoduimMod.items;

import com.doggie.RhoduimMod.Main;
import com.doggie.RhoduimMod.init.ModItems;
import com.doggie.RhoduimMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		ModItems.ITEMS.add(this);
		
	}
	@Override
	public void registerModels() 
	{
		
		Main.proxy.registerItemRenderer(this, 0, "Inventory");
	}

}
