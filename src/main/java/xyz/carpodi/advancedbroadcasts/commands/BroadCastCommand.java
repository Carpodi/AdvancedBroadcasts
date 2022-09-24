package xyz.carpodi.advancedbroadcasts.commands;
import com.google.common.base.Joiner;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.carpodi.advancedbroadcasts.AdvancedBroadcasts;
import xyz.carpodi.advancedbroadcasts.utils.MessageColors;

import java.util.Objects;

public class BroadCastCommand implements CommandExecutor {
    private AdvancedBroadcasts plugin;

    public BroadCastCommand(AdvancedBroadcasts plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if (!sender.hasPermission("broadcast.use")) {
            sender.sendMessage(MessageColors.getMsgColor("&cSorry! You dont have permission to use this."));
            return true;
        }else {

            if (args.length == 0) {
                sender.sendMessage(MessageColors.getMsgColor(("&cUssage: /broadcast <message>")));
                return true;
            }

            if (args.length > 0) {

                String message = Joiner.on(" ").skipNulls().join(args);
                String prefix = plugin.getConfig().getString("msg.prefix");


                for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
                    onlinePlayer.sendMessage(MessageColors.getMsgColor( prefix + message));
                }


            }


        }

        return true;
    }
}



