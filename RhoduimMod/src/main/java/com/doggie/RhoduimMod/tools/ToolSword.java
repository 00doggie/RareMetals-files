package com.doggie.RhoduimMod.tools;

import com.doggie.RhoduimMod.Main;
import com.doggie.RhoduimMod.init.ModItems;
import com.doggie.RhoduimMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel{

	public ToolSword(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
		
	}
	@Override
	public void registerModels() 
	{
		
		Main.proxy.registerItemRenderer(this, 0, "Inventory");
	}
}
