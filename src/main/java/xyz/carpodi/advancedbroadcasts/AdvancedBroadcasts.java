package xyz.carpodi.advancedbroadcasts;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.carpodi.advancedbroadcasts.Commands.BroadCastCommand;


public final class AdvancedBroadcasts extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("broadcast").setExecutor((CommandExecutor) new BroadCastCommand(this));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
