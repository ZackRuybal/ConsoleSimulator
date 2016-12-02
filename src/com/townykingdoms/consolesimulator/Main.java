package com.townykingdoms.consolesimulator;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by zackr on 12/1/2016.
 */
public class Main extends JavaPlugin implements Listener {

    private static Main instance;
    private static JavaPlugin plugin;

    public static Main getInstance() {
        return instance;
    }


    //On Enable On Disable
    @Override
    public void onEnable() {
        instance=this;
        Bukkit.getPluginManager().registerEvents(this, this);
        getLogger().info("Console Simulator Enabled");
        this.getCommand("asconsole").setExecutor(new com.townykingdoms.consolesimulator.command.Console());
    }
    @Override
    public void onDisable() {
        getLogger().info("Console Simulator Disabled");
    }
}
