package xyz.carpodi.advancedbroadcasts.Commands;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.carpodi.advancedbroadcasts.AdvancedBroadcasts;

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
            String prefix = ChatColor.translateAlternateColorCodes('&', "P&1Anuncio]");
            StringBuilder str = new StringBuilder();
            String s = str.toString();
            String coloredString = ChatColor.translateAlternateColorCodes('&', s);
            Player online = (Player) Bukkit.getServer().getOnlinePlayers();
            online.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + ""));
        }

        return true;
    }
}



