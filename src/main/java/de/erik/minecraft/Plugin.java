package de.erik.minecraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

/**
 * TODO: Intention dokumentieren
 */
public class Plugin extends JavaPlugin {

    private static final Logger LOGGER = Logger.getLogger(Plugin.class.getName());

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
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        LOGGER.info("My Plugin Command");
        return true;
    }

    public static boolean doWhatever(String param) {
        return true;
    }
}
