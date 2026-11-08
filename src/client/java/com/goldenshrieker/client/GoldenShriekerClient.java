package com.goldenshrieker.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Golden Shrieker – der Leuchteffekt kommt komplett aus den Block-Modellen
 * (assets/minecraft/blockstates/sculk_shrieker.json und assets/golden_shrieker/models/block/).
 * Diese Klasse sorgt nur dafür, dass der Mod sauber als Client-Mod geladen wird.
 */
public class GoldenShriekerClient implements ClientModInitializer {
	public static final String MOD_ID = "golden_shrieker";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitializeClient() {
		LOGGER.info("Golden Shrieker geladen - Sculk Shrieker leuchten jetzt golden.");
	}
}
