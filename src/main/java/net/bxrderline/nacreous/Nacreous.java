package net.bxrderline.nacreous;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// For testing purposes
public class Nacreous implements ModInitializer {

	public static final String MOD_ID = "nacreous";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}
