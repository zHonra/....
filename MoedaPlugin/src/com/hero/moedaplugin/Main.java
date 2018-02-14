package com.hero.moedaplugin;

import org.bukkit.ChatColor;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		new Register(this);
		getLogger().info(ChatColor.GREEN + "Plugin Ativado! Feito por:Heroynee_");
	}
	
	@Override
	public void onDisable() {
		HandlerList.unregisterAll();
		getLogger().info(ChatColor.RED + "Plugin Desativado!");
	}
	
	public static Main getInstance(){
		return Main.getPlugin(Main.class);
	}
	
	

}
