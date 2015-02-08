package com.mods.twingeeks.coinsmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * A tool item in the coins mod
 * @author CombatZAK
 *
 */
public class CoinsTool extends CoinsItem{
	//CONSTRUCTORS
	/**
	 * Default constructor
	 */
	public CoinsTool() {
		super(); //call base constructor
		setMaxDamage(0); //set default durability (single-use)
		setMaxStackSize(1); //reset stack ize
	}
	
	/**
	 * Creates a new CoinsTool instance with specified itemId
	 * 
	 * @param itemId ID of item
	 */
	public CoinsTool(String itemId) {
		super(itemId); //call base constructor
		setMaxDamage(0); //set default durability
		setMaxStackSize(1); //set stack size
	}
	
	/**
	 * Creates a new CoinsTool instance with specified features
	 * 
	 * @param itemId ID and unlocalized name of item
	 * @param creativeTab tab on which item appears
	 * @param maxDurability maximum uses of item
	 * @param textureName name of item image
	 */
	public CoinsTool(String itemId, CreativeTabs creativeTab, int maxDurability, String textureName) {
		super(itemId, creativeTab, 1, textureName); //call base constructor
		setMaxDamage(maxDurability); //set durability
		Items.bucket.canItemEditBlocks();
	}
	
	/**
	 * When used in crafting recipe, item does not leave grid
	 */
	@Override
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack) {
		return false;
	}
	
	/**
	 * When used in crafting recipe item loses 1 durability
	 */
	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		itemStack.setItemDamage(itemStack.getItemDamage() + 1);
		return itemStack;
	}
	
	/**
	 * Used to show that the item is a container for durability crafting
	 */
	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}
}
