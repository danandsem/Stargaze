package net.flo.stargaze;

import net.fabricmc.api.ModInitializer;

import net.flo.stargaze.item.ModItemGroups;
import net.flo.stargaze.item.ModItems;
import net.minecraft.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Stargaze  implements ModInitializer {
	public static final String MOD_ID = "stargaze";
    public static final Logger LOGGER = LoggerFactory.getLogger("stargaze");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		LOGGER.info("Hello Fabric world!");
	}
}