package net.quack95.lsd;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.quack95.lsd.item.ModItemGroups;
import net.quack95.lsd.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LSD implements ModInitializer {
	public static final String MOD_ID = "lsd";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		LOGGER.info("[LSD] Mod loaded");
	}
}