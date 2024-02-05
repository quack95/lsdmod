package net.quack95.lsd;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LSD implements ModInitializer {
	public static final String MOD_ID = "lsd";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("[LSD] Mod loaded");
	}
}