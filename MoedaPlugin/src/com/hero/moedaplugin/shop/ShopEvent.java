package com.hero.moedaplugin.shop;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import com.hero.moedaplugin.Ptag;
import com.hero.moedaplugin.api.Criar;
import com.hero.moedaplugin.moedas.Cash;

public class ShopEvent implements Listener {

	@EventHandler
	public void onShop(InventoryClickEvent e){
		if (!(e.getWhoClicked() instanceof Player)){
			return;
		}
		Player p = (Player)e.getWhoClicked();
		if (e.getInventory().getName().equals("§6§lSHOP DE MOEDAS")){
			e.setCancelled(true);
			if (e.getCurrentItem() == null) return;
			if (e.getCurrentItem().getType() == Material.AIR) return;
			if (e.getCurrentItem().getItemMeta().getDisplayName() == null) return;
			ItemStack item = e.getCurrentItem();
			switch (item.getItemMeta().getDisplayName()) {
			case "§2§lDOLLYNHO §7§lKIT":
				if (Cash.contains(p.getName(), 50)){
					p.sendMessage("§a§lCompra efetuada com sucesso!");
					p.sendMessage("§4§lAVISO: Os itens da compra foram enviados para seu inventario!");
					p.getInventory().addItem(Criar.add(Material.DIAMOND_SWORD, "§2§lDOLLYNHO §7§lKIT", new String [] {" ", "§c> §7§lKIT §2§lDOLLYNHO §4§lRARO"}, Enchantment.DAMAGE_ALL, 15, Enchantment.DURABILITY, 15, Enchantment.FIRE_ASPECT, 15));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_CHESTPLATE, "§2§lDOLLYNHO §7§lKIT", new String [] {" ", "§c> §7§lKIT §2§lDOLLYNHO §4§lRARO"}, Enchantment.PROTECTION_ENVIRONMENTAL, 15, Enchantment.DURABILITY, 15));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_HELMET, "§2§lDOLLYNHO §7§lKIT", new String [] {" ", "§c> §7§lKIT §2§lDOLLYNHO §4§lRARO"}, Enchantment.PROTECTION_ENVIRONMENTAL, 15, Enchantment.DURABILITY, 15));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_BOOTS, "§2§lDOLLYNHO §7§lKIT", new String [] {" ", "§c> §7§lKIT §2§lDOLLYNHO §4§lRARO"}, Enchantment.PROTECTION_ENVIRONMENTAL, 15, Enchantment.DURABILITY, 15));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_LEGGINGS, "§2§lDOLLYNHO §7§lKIT", new String [] {" ", "§c> §7§lKIT §2§lDOLLYNHO §4§lRARO"}, Enchantment.PROTECTION_ENVIRONMENTAL, 15, Enchantment.DURABILITY, 15));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_PICKAXE, "§2§lDOLLYNHO §7§lKIT", new String [] {" ", "§c> §7§lKIT §2§lDOLLYNHO §4§lRARO"}, Enchantment.DIG_SPEED, 15, Enchantment.DURABILITY, 15));
					p.playSound(p.getLocation(), Sound.CLICK, 1f, 1f);
					Cash.retirar(p.getName(), 50);
					p.closeInventory();
				} else {
					p.sendMessage(Ptag.prefix + "§cVocê não tem §2MOEDAS §csuficientes!");
					return;
				}
				break;
			case "§c§lSPIDER MANO §7§lKIT":
				if (Cash.contains(p.getName(), 100)){
					p.sendMessage("§a§lCompra efetuada com sucesso!");
					p.sendMessage("§4§lAVISO: Os itens da compra foram enviados para seu inventario!");
					p.getInventory().addItem(Criar.add(Material.DIAMOND_HELMET, "§c§lSPIDER MANO §7§lKIT", new String[] {" ", "§c> §1§LKIT §c§lSPIDER MANO §4§lRARO"}, Enchantment.PROTECTION_ENVIRONMENTAL, 20, Enchantment.DURABILITY, 20));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_CHESTPLATE, "§c§lSPIDER MANO §7§lKIT", new String[] {" ", "§c> §1§LKIT §c§lSPIDER MANO §4§lRARO"}, Enchantment.PROTECTION_ENVIRONMENTAL, 20, Enchantment.DURABILITY, 20));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_LEGGINGS, "§c§lSPIDER MANO §7§lKIT", new String[] {" ", "§c> §1§LKIT §c§lSPIDER MANO §4§lRARO"}, Enchantment.PROTECTION_ENVIRONMENTAL, 20, Enchantment.DURABILITY, 20));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_BOOTS, "§c§lSPIDER MANO §7§lKIT", new String[] {" ", "§c> §1§LKIT §c§lSPIDER MANO §4§lRARO"}, Enchantment.PROTECTION_ENVIRONMENTAL, 20, Enchantment.DURABILITY, 20));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_SWORD, "§c§lSPIDER MANO §7§lKIT", new String[] {" ", "§c> §1§LKIT §c§lSPIDER MANO §4§lRARO"}, Enchantment.DAMAGE_ALL, 20, Enchantment.DURABILITY, 20, Enchantment.FIRE_ASPECT, 20));
					p.playSound(p.getLocation(), Sound.CLICK, 1f, 1f);
					Cash.retirar(p.getName(), 100);
					p.closeInventory();
				} else {
					p.sendMessage(Ptag.prefix + "§cVocê não tem §2MOEDAS §csuficientes!");
					return;
				}
				break;
			case "§5§lSEGURA ESSA OSSADA §7§lKIT":
				if (Cash.contains(p.getName(), 50)){
					p.sendMessage("§a§lCompra efetuada com sucesso!");
					p.sendMessage("§4§lAVISO: Os itens da compra foram enviados para seu inventario!");
					p.getInventory().addItem(Criar.add(Material.BONE, "§5§lSEGURA ESSA OSSADA §7§lKIT", new String[] {" ", "§c> §7Osso §4§lOP §4§lRARO"}, Enchantment.KNOCKBACK, 15));
					p.playSound(p.getLocation(), Sound.CLICK, 1f, 1f);
					Cash.retirar(p.getName(), 50);
					p.closeInventory();
				} else {
					p.sendMessage(Ptag.prefix + "§cVocê não tem §2MOEDAS §csuficientes!");
					return;
				}
				break;
			case "§8§lTITANIUM §7§lKIT":
				if (Cash.contains(p.getName(), 150)){
					p.sendMessage("§a§lCompra efetuada com sucesso!");
					p.sendMessage("§4§lAVISO: Os itens da compra foram enviados para seu inventario!");
					p.getInventory().addItem(Criar.add(Material.DIAMOND_HELMET, "§8§lTITANIUM §", new String[] {" ", "§7§l> §7§lKIT §8§lTITANIUM §4§lRARO "}, Enchantment.PROTECTION_ENVIRONMENTAL, 30, Enchantment.DURABILITY, 30));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_CHESTPLATE, "§8§lTITANIUM §7§lKIT", new String[] {" ", "§7§l> §7§lKIT §8§lTITANIUM §4§lRARO "}, Enchantment.PROTECTION_ENVIRONMENTAL, 30, Enchantment.DURABILITY, 30));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_LEGGINGS, "§8§lTITANIUM §7§lKIT", new String[] {" ", "§7§l> §7§lKIT §8§lTITANIUM §4§lRARO "}, Enchantment.PROTECTION_ENVIRONMENTAL, 30, Enchantment.DURABILITY, 30));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_BOOTS, "§8§lTITANIUM §7§lKIT", new String[] {" ", "§7§l> §7§lKIT §8§lTITANIUM §4§lRARO "}, Enchantment.PROTECTION_ENVIRONMENTAL, 30, Enchantment.DURABILITY, 30));
					p.getInventory().addItem(Criar.add(Material.DIAMOND_SWORD, "§8§lTITANIUM §7§lKIT", new String[] {" ", "§7§l> §7§lKIT §8§lTITANIUM §4§lRARO "}, Enchantment.DAMAGE_ALL, 30, Enchantment.DURABILITY, 30, Enchantment.FIRE_ASPECT, 30));
					p.playSound(p.getLocation(), Sound.CLICK, 1f, 1f);
					Cash.retirar(p.getName(), 150);
					p.closeInventory();
				} else {
					p.sendMessage(Ptag.prefix + "§cVocê não tem §2MOEDAS §csuficientes!");
					return;
				}
				break;
			case "§6§lVIPS":
					p.playSound(p.getLocation(), Sound.CLICK, 1f, 1f);
					p.closeInventory();
					p.performCommand("vip");
					return;
				}

		}
			
		}
	}


	
	
