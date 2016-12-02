package com.townykingdoms.consolesimulator.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

/**
 * Created by zackr on 12/1/2016.
 */
public class Console implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("asconsole")) {
            if (!sender.hasPermission("consolesim.access")) {
                sender.sendMessage(ChatColor.DARK_RED + "You thought you could outsmart us?");
                return true;
            }
                StringBuilder str = new StringBuilder();
                for (int i = 0; i < args.length; i++) {
                    str.append(args[i] + " ");
                }
            ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                String consoleCommand = str.toString();
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(),consoleCommand);
                return true;
        }
        return true;
    }
}
