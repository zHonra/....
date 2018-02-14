package com.hero.moedaplugin;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;

import com.hero.moedaplugin.moedas.CashCommand;
import com.hero.moedaplugin.moedas.ShopCommand;
import com.hero.moedaplugin.shop.ShopEvent;
import com.hero.moedaplugin.shop.ShopVillager;

public class Register {

	public Register(Main pl) {
		RegisterEvents(pl);
		RegisterCommands(pl);
	}
	
	void C(CommandExecutor classe, String comando, Main pl){
		pl.getCommand(comando).setExecutor(classe);
	}


	void E(Listener classe, Main pl){
		Bukkit.getPluginManager().registerEvents(classe, pl);
	}


	void RegisterEvents(Main pl){
		E(new Evento(), pl);
		E(new ShopEvent(), pl);
	}
	
	void RegisterCommands(Main pl){
		C(new CashCommand(), "moeda", pl);
		C(new ShopCommand(), "shop", pl);
		C(new ShopVillager(), "npc", pl);
		
		
	}
	
}
