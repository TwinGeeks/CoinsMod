package com.mods.twingeeks.coinsmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Item extension used for registration and references within CoinsMod
 * 
 * @author CombatZAK
 *
 */
public class CoinsItem extends Item {

	//DEFAULTS
	private static final int DEFAULT_STACK_SIZE = 64; //default max stack size
	private static final CreativeTabs DEFAULT_CREATIVE_TAB = CreativeTabs.tabMisc; //default tab on which items are shown
	private static final String DEFAULT_UNLOCALIZED_NAME = "coins.name.unlocalized"; //default unlocalized name for items
	private static final String DEFAULT_ITEM_ID = "coins.itemid"; //default registration id for item
	private static final String DEFAULT_TEXTURE_NAME = "coinsmod:textureName"; //default texture file name
	
	//CONSTRUCTORS
	
	/**
	 * Default constructor
	 */
	public CoinsItem() {
		//set configured values
		setMaxStackSize(DEFAULT_STACK_SIZE);
		setCreativeTab(DEFAULT_CREATIVE_TAB);
		setItemId(DEFAULT_ITEM_ID);
		setUnlocalizedName(DEFAULT_UNLOCALIZED_NAME);
		setTextureName(DEFAULT_TEXTURE_NAME);
	}
	
	/**
	 * Creates a new CoinsItem instance with specified itemId
	 * 
	 * @param itemId ID of item for registration with game; also used as unlocalized name
	 */
	public CoinsItem(String itemId) {
		//set configured values
		setMaxStackSize(DEFAULT_STACK_SIZE);
		setCreativeTab(DEFAULT_CREATIVE_TAB);
		setItemId(itemId);
		setUnlocalizedName(itemId);
		setTextureName(DEFAULT_TEXTURE_NAME);
	}
	
	/**
	 * Creates a neew CoinsItem instance with specified values
	 * 
	 * @param itemId id and unlocalized name of item
	 * @param creativeTab tab on which item should appear
	 * @param stackSize max stack size for item
	 * @param textureName name of texture file
	 */
	public CoinsItem(String itemId, CreativeTabs creativeTab, int stackSize, String textureName) {
		//set configured values
		setItemId(itemId);
		setUnlocalizedName(itemId);
		setCreativeTab(creativeTab);
		setMaxStackSize(stackSize);
		setTextureName(textureName);
	}

	//FIELDS
	private String itemId = DEFAULT_ITEM_ID;

	/**
	 * Gets the ID for the item
	 * 
	 * @return item's ID
	 */
	public String getItemId() {
		return itemId;
	}

	/**
	 * Sets the ID for the item
	 * 
	 * @param _itemId ID value
	 */
	public void setItemId(String _itemId) {
		this.itemId = _itemId;
	}
}
