package com.mods.twingeeks.coinsmod;

import com.mods.twingeeks.coinsmod.items.ItemRegistry;
import com.mods.twingeeks.coinsmod.recipes.CraftingRegistry;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=CoinsMod.MODID, name=CoinsMod.MOD_NAME, version=CoinsMod.MOD_VERSION, dependencies=CoinsMod.DEPENDENCIES)
public class CoinsMod {
	
	public static final String MODID = "coinsmod"; //Unique mod ID
	public static final String MOD_NAME = "Coins Mod"; //name of mod
	public static final String MOD_VERSION = "0.1.1"; //Mod version
	public static final String DEPENDENCIES = "required-after:Thaumcraft;required-after:ThermalFoundation"; //required mods
	
	@Instance
	public static CoinsMod instance; //singleton mod instance
	
	@SidedProxy(clientSide="com.mods.twingeeks.coinsmod.client.ClientProxy", serverSide="com.mods.twingeeks.coinsmod.CommonProxy")
	public static CommonProxy proxy; //proxy handle
	
	/**
	 * Handles pre-initialization event
	 * 
	 * @param event Event args
	 */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ItemRegistry.registerItems();
	}
	
	/**
	 * Handles initialization event
	 * 
	 * @param event Event args
	 */
	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers(); //proxy stub
		
		//add recipes
		ItemRegistry.registerOreDict();
		CraftingRegistry.registerRecipes();
		CraftingRegistry.registerSmelting();
	}
	
	/**
	 * Handles post-initialization event
	 * 
	 * @param event Event args
	 */
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//stub
	}
}
