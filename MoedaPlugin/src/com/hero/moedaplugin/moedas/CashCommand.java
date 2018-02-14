package com.hero.moedaplugin.moedas;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class CashCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {

		if (cmd.getName().equalsIgnoreCase("moeda")){
			Player p = (Player)sender;
			if (args.length == 0){
				p.sendMessage("�eSuas moedas: �a" + Cash.get(p.getName()));
				return true;
			}

			if (args.length > 0){
				if (!p.hasPermission("pvp.moedaadmin")){
					p.sendMessage("�cUse: /moeda (add, set, retirar!)");
					return true;
				}
				if (args[0].equalsIgnoreCase("set")){
					if (args.length == 1){
						p.sendMessage("�cUse: �f/moeda set �7(player, valor)");
						return true;
					}
					String target = args[1];
					String numero = args[2];
					if (!Cash.cash.contains(target)){
						p.sendMessage("�cEste jogador n�o existe!");
						return true;
					}
					Integer valor;
					try {
						valor = Integer.parseInt(numero);
					} catch (NumberFormatException e) {
						p.sendMessage("�cDigite um valor v�lido!");
						return true;
					}
					Cash.set(target, valor);
					p.sendMessage("�cVoc� setou as moedas do jogador �f" + target + "�c para �f" + valor);
				}
				if (args[0].equalsIgnoreCase("add")){
					if (args.length == 1){
						p.sendMessage("�cUse: /moeda add (player, valor)");
						return true;
					}
					String target = args[1];
					String numero = args[2];
					if (!Cash.cash.contains(target)){
						p.sendMessage("�cEste jogador n�o existe!");
						return true;
					}
					Integer valor;
					try {
						valor = Integer.parseInt(numero);
					} catch (NumberFormatException e) {
						p.sendMessage("�cDigite um valor v�lido!");
						return true;
					}
					Cash.add(target, valor);
					p.sendMessage("�eVoc� adicionou �f" + valor + "�e moedas para o jogador �f" + target);
				}
				if (args[0].equalsIgnoreCase("retirar")){
					if (args.length == 1){
						p.sendMessage("�cUse: /cash retirar (player, valor)");
						return true;
					}
					String target = args[1];
					String numero = args[2];
					if (!Cash.cash.contains(target)){
						p.sendMessage("Este jogador n�o existe!");
						return true;
					}
					Integer valor;
					try {
						valor = Integer.parseInt(numero);
					} catch (NumberFormatException e) {
						p.sendMessage("�cDigite um valor v�lido!");
						return true;
					}
					Cash.retirar(target, valor);
					p.sendMessage("�eVoc� retirou �f" + valor + "�e de moedas do jogador �f" + target);
				}
			}
		}

		return false;
	}

}
