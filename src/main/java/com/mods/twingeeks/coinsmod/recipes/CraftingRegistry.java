package com.mods.twingeeks.coinsmod.recipes;

import thaumcraft.common.config.ConfigItems;
import thermalfoundation.item.TFItems;

import com.mods.twingeeks.coinsmod.items.ItemRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Registers vanilla recipes for coins
 * 
 * @author CombatZAK
 *
 */
public class CraftingRegistry {
	//ITEM-STACKS - stacks of single quantities used for templating
	private static ItemStack copperCoinStack = new ItemStack(ItemRegistry.copperCoin);
	private static ItemStack silverCoinStack = new ItemStack(ItemRegistry.silverCoin);
	private static ItemStack goldCoinStack = new ItemStack(ConfigItems.itemResource, 1, 18); //get the gold coin from Thaumcraft
	private static ItemStack platinumCoinStack = new ItemStack(ItemRegistry.platinumCoin);
	
	private static ItemStack copperStackStack = new ItemStack(ItemRegistry.copperStack);
	private static ItemStack silverStackStack = new ItemStack(ItemRegistry.silverStack);
	private static ItemStack goldStackStack = new ItemStack(ItemRegistry.goldStack);
	private static ItemStack platinumStackStack = new ItemStack(ItemRegistry.platinumStack);
	
	private static ItemStack copperBagStack = new ItemStack(ItemRegistry.copperBag);
	private static ItemStack silverBagStack = new ItemStack(ItemRegistry.silverBag);
	private static ItemStack goldBagStack = new ItemStack(ItemRegistry.goldBag);
	private static ItemStack platinumBagStack = new ItemStack(ItemRegistry.platinumBag);
	
	private static ItemStack hammerHeadStack = new ItemStack(ItemRegistry.hammerHead);
	private static ItemStack strikeHammerStack = new ItemStack(ItemRegistry.strikeHammer);
	private static ItemStack ironIngotStack = new ItemStack(Items.iron_ingot);
	
	/**
	 * Registers standard crafting recipes
	 */
	public static void registerRecipes() {
		//coins to stacks...
		GameRegistry.addShapelessRecipe(copperStackStack, copperCoinStack, copperCoinStack, copperCoinStack,
														  copperCoinStack, copperCoinStack, copperCoinStack,
														  copperCoinStack, copperCoinStack, copperCoinStack);
		GameRegistry.addShapelessRecipe(silverStackStack, silverCoinStack, silverCoinStack, silverCoinStack,
														  silverCoinStack, silverCoinStack, silverCoinStack,
														  silverCoinStack, silverCoinStack, silverCoinStack);
		GameRegistry.addShapelessRecipe(goldStackStack, goldCoinStack, goldCoinStack, goldCoinStack,
														goldCoinStack, goldCoinStack, goldCoinStack,
														goldCoinStack, goldCoinStack, goldCoinStack);
		GameRegistry.addShapelessRecipe(platinumStackStack, platinumCoinStack, platinumCoinStack, platinumCoinStack,
															platinumCoinStack, platinumCoinStack, platinumCoinStack,
															platinumCoinStack, platinumCoinStack, platinumCoinStack);
		
		//stacks to bags...
		GameRegistry.addShapelessRecipe(copperBagStack, copperStackStack, copperStackStack, copperStackStack,
													    copperStackStack, copperStackStack, copperStackStack,
													    copperStackStack, copperStackStack, copperStackStack);
		GameRegistry.addShapelessRecipe(silverBagStack, silverStackStack, silverStackStack, silverStackStack,
														silverStackStack, silverStackStack, silverStackStack,
														silverStackStack, silverStackStack, silverStackStack);
		GameRegistry.addShapelessRecipe(goldBagStack, goldStackStack, goldStackStack, goldStackStack,
													  goldStackStack, goldStackStack, goldStackStack,
													  goldStackStack, goldStackStack, goldStackStack);
		GameRegistry.addShapelessRecipe(platinumBagStack, platinumStackStack, platinumStackStack, platinumStackStack,
														  platinumStackStack, platinumStackStack, platinumStackStack,
														  platinumStackStack, platinumStackStack, platinumStackStack);
		
		//stacks to coins...
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.copperCoin, 9), copperStackStack);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.silverCoin, 9), silverStackStack);
		GameRegistry.addShapelessRecipe(new ItemStack(ConfigItems.itemResource, 9, 18), goldStackStack);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.platinumCoin, 9), platinumStackStack);
		
		//bags to stacks
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.copperStack, 9), copperBagStack);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.silverStack, 9), silverBagStack);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.goldStack, 9), goldBagStack);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.platinumStack, 9), platinumBagStack);
		
		//make a hammer
		GameRegistry.addRecipe(new ShapedOreRecipe(strikeHammerStack, "  x",
														" y ",
														"y  ", 'x', hammerHeadStack, 'y', "stick").setMirrored(true));
		/*GameRegistry.addShapedRecipe(strikeHammerStack, "x  ",
														" y ",
														"  y", 'x', hammerHeadStack, 'y', stickStack);*/
		
		//make a hammer head
		GameRegistry.addRecipe(new ShapedOreRecipe(hammerHeadStack, "xyx",
													  "xyx", 'x', ironIngotStack, 'y', "ingotLead"));
		
		//make some coins
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemRegistry.copperCoin, 8), new ItemStack(ItemRegistry.strikeHammer, 1, OreDictionary.WILDCARD_VALUE), "ingotCopper"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemRegistry.silverCoin, 8), new ItemStack(ItemRegistry.strikeHammer, 1, OreDictionary.WILDCARD_VALUE), "ingotSilver"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ConfigItems.itemResource, 8, 18), new ItemStack(ItemRegistry.strikeHammer, 1, OreDictionary.WILDCARD_VALUE), "ingotGold"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemRegistry.platinumCoin, 8), new ItemStack(ItemRegistry.strikeHammer, 1, OreDictionary.WILDCARD_VALUE), "ingotPlatinum"));
	}
	
	/**
	 * Registers smelting recipes for coins
	 */
	public static void registerSmelting() {
		//coins smelt to nuggets
		GameRegistry.addSmelting(copperCoinStack, TFItems.nuggetCopper, 0.1F);
		GameRegistry.addSmelting(silverCoinStack, TFItems.nuggetSilver, 0.1F);
		GameRegistry.addSmelting(platinumCoinStack, TFItems.nuggetPlatinum, 0.1F);
	}
}
