package de.erik.minecraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;

import java.io.File;
import java.util.logging.Logger;

/**
 * TODO: Intention dokumentieren
 */
public class Plugin extends JavaPlugin {

	private static final Logger LOGGER =
			Logger.getLogger(Plugin.class.getName());

	/**
	 * Test Support @see https://github.com/MockBukkit/MockBukkit
	 */
	public Plugin() {
		super();
	}

	/**
	 * Test Support @see https://github.com/MockBukkit/MockBukkit
	 */
	protected Plugin(JavaPluginLoader loader, PluginDescriptionFile description,
			File dataFolder, File file) {
		super(loader, description, dataFolder, file);
	}

	public boolean doWhatever(String param) {
		return true;
	}

	@Override
	public void onEnable() {
		LOGGER.info("My Plugin enabled");
	}

	@Override
	public void onDisable() {
		LOGGER.info("My Plugin disabled");
	}

	public void onEvent(BlockBreakEvent event) {
		// Muss zuvor registriert werden
		LOGGER.info("My Plugin BlockBreakEvent");
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		LOGGER.info("My Plugin Command");
		return true;
	}

}
