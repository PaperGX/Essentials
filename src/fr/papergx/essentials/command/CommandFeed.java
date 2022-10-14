package fr.papergx.essentials.command;

import org.bukkit.entity.Player;

public class CommandFeed {
    public static void doFEED(Player player, String s, String[] strings) {
        String prefix = "§2§lIrilia§a§lMC §f§l➜ §f";
        if(player.hasPermission("essentials.feed")) {
            if(player.getFoodLevel() < 20) {
                player.setFoodLevel(20);
                player.sendMessage(prefix + "Tu as été §a§lrassasié");
            } else {
                player.sendMessage(prefix + "§cTa nourriture est déja au maximum !");
            }
        } else {
            player.sendMessage(prefix + "§cTu n'as pas la permission de faire cela !");
        }
    }
}
