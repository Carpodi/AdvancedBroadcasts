package xyz.carpodi.advancedbroadcasts;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.carpodi.advancedbroadcasts.commands.BroadCastCommand;
import xyz.carpodi.advancedbroadcasts.filemanagers.FileManager;


public final class AdvancedBroadcasts extends JavaPlugin {

    private FileManager config;

    @Override
    public void onEnable() {
        getCommand("broadcast").setExecutor((CommandExecutor) new BroadCastCommand(this));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public void registerConfigs() {
        /*Register your config
        this.yourconfignameorvalue = new FileManager(this, "yourconfignameorvalue");
        */

        this.config = new FileManager(this, "config");

    }

    /*Created Method to call in another class
    public FileManager getYpurConfigNameORValue() {
        return this.yourconfignameorvalue;
    }
    */
    public FileManager getConfig() {
        return this.config;
    }



}


