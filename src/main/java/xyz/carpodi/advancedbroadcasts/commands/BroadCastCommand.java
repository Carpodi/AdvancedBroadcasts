package xyz.carpodi.advancedbroadcasts.commands;
import com.google.common.base.Joiner;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.carpodi.advancedbroadcasts.AdvancedBroadcasts;

import java.util.Objects;

public class BroadCastCommand implements CommandExecutor {
    private AdvancedBroadcasts plugin;

    public BroadCastCommand(AdvancedBroadcasts plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;
        if (!p.hasPermission("broadcast.use")) {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cSorry! You dont have permission to use this."));
            return true;
        }else {

            if (args.length == 0) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cUssage: /broadcast <message>"));
                return true;
            }

            if (args.length > 0) {

                String message = Joiner.on(" ").skipNulls().join(args);
                String prefix = plugin.getConfig().getString("msg.prefix");


                for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
                    onlinePlayer.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + message));
                }


            }


        }

        return true;
    }
}



