package com.mods.twingeeks.coinsmod.items;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Registry for all items added by the mod
 * 
 * @author CombatZAK
 *
 */
public class ItemRegistry {

	//COINS
	public static Item copperCoin = new CoinsItem("coinCopper", CreativeTabs.tabMisc, 64, "coinsmod:coinCopper");
	public static Item silverCoin = new CoinsItem("coinSilver", CreativeTabs.tabMisc, 64, "coinsmod:coinSilver");
	public static Item platinumCoin = new CoinsItem("coinPlatinum", CreativeTabs.tabMisc, 64, "coinsmod:coinPlatinum");
	
	//STACKS
	public static Item copperStack = new CoinsItem("stackCopper", CreativeTabs.tabMisc, 64, "coinsmod:stackCopper");
	public static Item silverStack = new CoinsItem("stackSilver", CreativeTabs.tabMisc, 64, "coinsmod:stackSilver");
	public static Item goldStack = new CoinsItem("stackGold", CreativeTabs.tabMisc, 64, "coinsmod:stackGold");
	public static Item platinumStack = new CoinsItem("stackPlatinum", CreativeTabs.tabMisc, 64, "coinsmod:stackPlatinum");
	
	//BAGS
	public static Item copperBag = new CoinsItem("bagCopper", CreativeTabs.tabMisc, 64, "coinsmod:bagCopper");
	public static Item silverBag = new CoinsItem("bagSilver", CreativeTabs.tabMisc, 64, "coinsmod:bagSilver");
	public static Item goldBag = new CoinsItem("bagGold", CreativeTabs.tabMisc, 64, "coinsmod:bagGold");
	public static Item platinumBag = new CoinsItem("bagPlatinum", CreativeTabs.tabMisc, 64, "coinsmod:bagPlatinum");
	
	/**
	 * Registers the items in the game
	 */
	public static void registerItems() {
		Field[] declaredFields = ItemRegistry.class.getDeclaredFields(); //get all the fields
		for (Field field : declaredFields) {
			//check that the field is static and a coinsitem class
			if (!Modifier.isStatic(field.getModifiers()) || field.getType().equals(CoinsItem.class))
				continue; //if either condition is not met, skip the field
			
			CoinsItem regItem = null;
			
			try {
				regItem = (CoinsItem)field.get(null); //get the item value
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			
			GameRegistry.registerItem(regItem, regItem.getItemId()); //register the item
		}
	}
	
	/**
	 * Registers the coins in the ore dictionary as appropriate
	 */
	public static void registerOreDict() {
		OreDictionary.registerOre("nuggetCopper", copperCoin);
		OreDictionary.registerOre("nuggetSilver", silverCoin);
		OreDictionary.registerOre("nuggetPlatinum", platinumCoin);
	}
}
