package com.doggie.RhoduimMod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
public class ModRecipes 
{

	public static void init() {
		GameRegistry.addSmelting(ModBlocks.RHODUIM_ORE, new ItemStack(ModItems.RHODUIM_INGOT, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.ELACTRITE_ORE, new ItemStack(ModItems.ELACTRITE_INGOT, 1), 2.0F);
	}
}
