package com.hero.moedaplugin.shop;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.hero.moedaplugin.api.Criar;

public class ShopInv {

	public static void open(Player p){
		Inventory inv = Bukkit.createInventory(null, InventoryType.PLAYER, "§6§lSHOP");
		
		ItemStack sword = Criar.add(Material.DIAMOND_SWORD, "§2§lDOLLYNHO §7§lKIT", new String[] {" ", "§7§l> §7§lKIT §2§lDOLLYNHO §4§lRARO", "§7§l> §2§lCusto: 50 Cash"}, Enchantment.DAMAGE_ALL, 15);
		ItemStack peitoral = Criar.add(Material.DIAMOND_CHESTPLATE, "§c§lSPIDER MANO §7§lKIT", new String[] {" ", "§7§l> §1§LKIT §c§lSPIDER MANO §4§lRARO", "§7§l> §2§lCusto: 100 Cash"}, Enchantment.DAMAGE_ALL, 15);
		ItemStack beacon = Criar.add(Material.BONE, "§5§lSEGURA ESSA OSSADA §7§lKIT", new String[] {" ", "§7§l> §7Osso §4§lOP §4§lRARO", "§7§l> §2§lCusto: 50 Cash"}, Enchantment.KNOCKBACK, 15);
		ItemStack espada = Criar.add(Material.IRON_SWORD, "§8§lTITANIUM §7§lKIT", new String[] {" ", "§7§l> §7KIT TITANIUM §4§lRARO", "§7§l> §2§lCusto: 150 Cash"}, Enchantment.DAMAGE_ALL, 15);
		ItemStack vips = Criar.add(Material.EMERALD_BLOCK, "§6§lVIPS", new String[] {" ", "§7§l> §6Compre seu vip aqui!"}, Enchantment.DAMAGE_ALL, 100);
		ItemStack vidro = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro1 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro2 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro3 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro4 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro5 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro6 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro7 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro8 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro9 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro10 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		ItemStack vidro11 = Criar.add(Material.STAINED_GLASS_PANE, "§7", new String[] {"§7"});
		
		
		inv.setItem(31, vips);
		inv.setItem(26, vidro11);
		inv.setItem(35, vidro10);
		inv.setItem(34, vidro9);
		inv.setItem(27, vidro7);
		inv.setItem(28, vidro8);
		inv.setItem(18, vidro6);
		inv.setItem(0, vidro1);
		inv.setItem(1, vidro2);
		inv.setItem(9, vidro);
		inv.setItem(7, vidro4);
		inv.setItem(8, vidro3);
		inv.setItem(17, vidro5);
		inv.setItem(10, sword);
		inv.setItem(12, peitoral);
		inv.setItem(14, beacon);
		inv.setItem(16, espada);
		
		
		p.openInventory(inv);
		p.playSound(p.getLocation(), Sound.CHEST_OPEN, 1F, 1.5F);
	}
	
	
	
}
