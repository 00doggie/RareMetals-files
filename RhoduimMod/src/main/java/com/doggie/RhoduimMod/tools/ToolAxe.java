package com.doggie.RhoduimMod.tools;

import com.doggie.RhoduimMod.Main;
import com.doggie.RhoduimMod.init.ModItems;
import com.doggie.RhoduimMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;

public class ToolAxe extends ItemAxe implements IHasModel{

	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, 6.0F, -3.2F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
		
	}
	public void registerModels() 
	{
		
		Main.proxy.registerItemRenderer(this, 0, "Inventory");
	}
}