package com.mods.twingeeks.coinsmod.recipes;

import thaumcraft.common.config.ConfigItems;

import com.mods.twingeeks.coinsmod.items.ItemRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

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
	}
}
