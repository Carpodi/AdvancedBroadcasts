package xyz.carpodi.advancedbroadcasts;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.carpodi.advancedbroadcasts.commands.BroadCastCommand;
import xyz.carpodi.advancedbroadcasts.filemanagers.FileManager;
import xyz.carpodi.advancedbroadcasts.utils.MessageColors;


public final class AdvancedBroadcasts extends JavaPlugin {

    private FileManager config;
    PluginDescriptionFile pdffile = getDescription();
    public String version = this.pdffile.getVersion();

    @Override
    public void onEnable() {
        getCommand("broadcast").setExecutor((CommandExecutor) new BroadCastCommand(this));

        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&7&m------------------------------------"));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&aAdvancedBroadcasts &b"+version));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&r "));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&a Thanks for using AdvancedBroadcasts! :D"));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&2 Created By: &fCarpodi&7, &fHappyRogelio7&7, &fKamila21Y&7, &fKaoryStudios&7, &fKaoryStudiosMC&7."));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&r "));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&a Server Version:&f "+Bukkit.getVersion()));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&r "));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&9&l Discord: &fhttps://discord.gg/3EebYUyeUX"));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&d&l GitHub: &fhttps://github.com/KaoryStudios"));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&7&m------------------------------------"));
        /*
        *Start code add by HappyRogelio7
        */
        registerConfigs();
        /*
         *END code add by HappyRogelio7
         */
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


