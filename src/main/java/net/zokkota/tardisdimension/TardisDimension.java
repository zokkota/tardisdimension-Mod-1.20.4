package net.zokkota.tardisdimension;

import net.fabricmc.api.ModInitializer;

import net.zokkota.tardisdimension.block.ModBlocks;
import net.zokkota.tardisdimension.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TardisDimension implements ModInitializer {
	public static final String MOD_ID = "tardisdimension";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModBlocks.registerBlocks();
	}
}