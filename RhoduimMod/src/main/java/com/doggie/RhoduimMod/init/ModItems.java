package com.doggie.RhoduimMod.init;

import java.util.ArrayList;
import java.util.List;

import com.doggie.RhoduimMod.items.ItemBase;
import com.doggie.RhoduimMod.items.armor.ArmorBase;
import com.doggie.RhoduimMod.tools.ToolAxe;
import com.doggie.RhoduimMod.tools.ToolHoe;
import com.doggie.RhoduimMod.tools.ToolPickaxe;
import com.doggie.RhoduimMod.tools.ToolSpade;
import com.doggie.RhoduimMod.tools.ToolSword;
import com.doggie.RhoduimMod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
public static final List<Item> ITEMS = new ArrayList<Item>();

//Materials
public static final ToolMaterial MATERIAL_RHODUIM_INGOT = EnumHelper.addToolMaterial("material_rhoduim_ingot", 3, 2150, 7.0F, 4.0F, 10);
public static final ToolMaterial MATERIAL_ELACTRITE_INGOT = EnumHelper.addToolMaterial("material_elactrite_ingot", 3, 1750, 10.0F, 8.0F, 10);
public static final ToolMaterial MATERIAL_DARKRUBY = EnumHelper.addToolMaterial("material_darkruby", 2, 500, 4.0F, 2.5F, 10);
public static final  ArmorMaterial RHODUIM_ARMOR = EnumHelper.addArmorMaterial("rhoduim_armor",Reference.MOD_ID + ":rhoduim", 14, new int[] {4,7,9,4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
public static final  ArmorMaterial DARKRUBY_ARMOR = EnumHelper.addArmorMaterial("darkruby_armor",Reference.MOD_ID + ":darkruby", 14, new int[] {3,6,7,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
public static final  ArmorMaterial ELACTRITE_ARMOR = EnumHelper.addArmorMaterial("elactrite_armor",Reference.MOD_ID + ":elactrite", 14, new int[] {6,9,11,6}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
//Items
public static final Item RHODUIM_INGOT = new ItemBase("rhoduim_ingot");
public static final Item DARKRUBY = new ItemBase("darkruby");
public static final Item ELACTRITE_INGOT = new ItemBase("elactrite_ingot");
public static final Item OSMIUM_INGOT = new ItemBase("osmium_ingot");

//Tools
public static final ItemSword RHODUIM_SWORD = new ToolSword("rhoduim_sword", MATERIAL_RHODUIM_INGOT);
public static final ItemSpade RHODUIM_SHOVEL = new ToolSpade("rhoduim_shovel", MATERIAL_RHODUIM_INGOT);
public static final ItemPickaxe RHODUIM_PICKAXE = new ToolPickaxe("rhoduim_pickaxe", MATERIAL_RHODUIM_INGOT);
public static final ItemAxe RHODUIM_AXE = new ToolAxe("rhoduim_axe", MATERIAL_RHODUIM_INGOT);
public static final ItemHoe RHODUIM_HOE = new ToolHoe("rhoduim_hoe", MATERIAL_RHODUIM_INGOT);
public static final ItemSword DARKRUBY_SWORD = new ToolSword("darkruby_sword", MATERIAL_DARKRUBY);
public static final ItemPickaxe DARKRUBY_PICKAXE = new ToolPickaxe("darkruby_pickaxe", MATERIAL_DARKRUBY);
public static final ItemAxe DARKRUBY_AXE = new ToolAxe("darkruby_axe", MATERIAL_DARKRUBY);
public static final ItemSpade DARKRUBY_SHOVEL = new ToolSpade("darkruby_shovel", MATERIAL_DARKRUBY);
public static final ItemHoe DARKRUBY_HOE = new ToolHoe("darkruby_hoe", MATERIAL_DARKRUBY);
public static final ItemSword ELACTRITE_SWORD = new ToolSword("elactrite_sword", MATERIAL_ELACTRITE_INGOT);
public static final ItemSpade ELACTRITE_SHOVEL = new ToolSpade("elactrite_shovel", MATERIAL_ELACTRITE_INGOT);
public static final ItemPickaxe ELACTRITE_PICKAXE = new ToolPickaxe("elactrite_pickaxe", MATERIAL_ELACTRITE_INGOT);
public static final ItemAxe ELACTRITE_AXE = new ToolAxe("elactrite_axe", MATERIAL_ELACTRITE_INGOT);
public static final ItemHoe ELACTRITE_HOE = new ToolHoe("elactrite_hoe", MATERIAL_ELACTRITE_INGOT);
//Armor
public static final Item RHODUIM_HELMET = new ArmorBase("rhoduim_helmet", RHODUIM_ARMOR, 1, EntityEquipmentSlot.HEAD );
public static final Item RHODUIM_CHESTPLATE = new ArmorBase("rhoduim_chestplate", RHODUIM_ARMOR, 1, EntityEquipmentSlot.CHEST );
public static final Item RHODUIM_LEGINGS = new ArmorBase("rhoduim_leggings", RHODUIM_ARMOR, 2, EntityEquipmentSlot.LEGS );
public static final Item RHODUIM_BOOTS = new ArmorBase("rhoduim_boots", RHODUIM_ARMOR, 1, EntityEquipmentSlot.FEET );
public static final Item DARKRUBY_HELMET = new ArmorBase("darkruby_helmet",DARKRUBY_ARMOR, 1, EntityEquipmentSlot.HEAD );
public static final Item DARKRUBY_CHESTPLATE = new ArmorBase("darkruby_chestplate", DARKRUBY_ARMOR, 1, EntityEquipmentSlot.CHEST );
public static final Item DARKRUBY_LEGINGS = new ArmorBase("darkruby_leggings", DARKRUBY_ARMOR, 2, EntityEquipmentSlot.LEGS );
public static final Item DARKRUBY_BOOTS = new ArmorBase("darkruby_boots", DARKRUBY_ARMOR, 1, EntityEquipmentSlot.FEET );
public static final Item ELACTRITE_HELMET = new ArmorBase("elactrite_helmet",ELACTRITE_ARMOR, 1, EntityEquipmentSlot.HEAD );
public static final Item ELACTRITE_CHESTPLATE = new ArmorBase("elactrite_chestplate", ELACTRITE_ARMOR, 1, EntityEquipmentSlot.CHEST );
public static final Item ELACTRITE_LEGINGS = new ArmorBase("elactrite_leggings", ELACTRITE_ARMOR, 2, EntityEquipmentSlot.LEGS );
public static final Item ELACTRITE_BOOTS = new ArmorBase("elactrite_boots", ELACTRITE_ARMOR, 1, EntityEquipmentSlot.FEET );
}
