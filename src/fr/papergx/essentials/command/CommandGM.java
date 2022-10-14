package fr.papergx.essentials.command;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public class CommandGM {
    public static void doGM(Player player, String s, String[] strings) {
        String prefix = "§2§lIrilia§a§lMC §f§l➜ §f";
        switch (strings.length) {
            case 1:
                switch (strings[0].toLowerCase()) {
                    case "0":
                        if(player.hasPermission("essentials.gm.survie")) {
                            player.setGameMode(GameMode.SURVIVAL);
                            player.sendMessage(prefix + "Passage en Gamemode §a§lSurvie");
                        } else {
                            player.sendMessage(prefix + "§cTu n'as pas la permission de faire cela !");
                        }
                        break;
                    case "1":
                        if(player.hasPermission("essentials.gm.creatif")) {
                            player.setGameMode(GameMode.CREATIVE);
                            player.sendMessage(prefix + "Passage en Gamemode §a§lCreatif");
                        } else {
                            player.sendMessage(prefix + "§cTu n'as pas la permission de faire cela !");
                        }
                        break;
                    case "3":
                        if(player.hasPermission("essentials.gm.spectateur")) {
                            player.setGameMode(GameMode.SPECTATOR);
                            player.sendMessage(prefix + "Passage en Gamemode §a§lSpectateur");
                        } else {
                            player.sendMessage(prefix + "§cTu n'as pas la permission de faire cela !");
                        }
                        break;
                }
        }
    }

    public static void doGMC(Player player, String s, String[] strings) {
        String prefix = "§2§lIrilia§a§lMC §f§l➜ §f";
        if(player.hasPermission("essentials.gm.creatif")) {
            player.setGameMode(GameMode.CREATIVE);
            player.sendMessage(prefix + "Passage en Gamemode §a§lCreatif");
        } else {
            player.sendMessage(prefix + "§cTu n'as pas la permission de faire cela !");
        }
    }

    public static void doGMS(Player player, String s, String[] strings) {
        String prefix = "§2§lIrilia§a§lMC §f§l➜ §f";
        if(player.hasPermission("essentials.gm.survie")) {
            player.setGameMode(GameMode.SURVIVAL);
            player.sendMessage(prefix + "Passage en Gamemode §a§lSurvie");
        } else {
            player.sendMessage(prefix + "§cTu n'as pas la permission de faire cela !");
        }
    }

    public static void doGMSP(Player player, String s, String[] strings) {
        String prefix = "§2§lIrilia§a§lMC §f§l➜ §f";
        if(player.hasPermission("essentials.gm.spectateur")) {
            player.setGameMode(GameMode.SPECTATOR);
            player.sendMessage(prefix + "Passage en Gamemode §a§lSpectateur");
        } else {
            player.sendMessage(prefix + "§cTu n'as pas la permission de faire cela !");
        }
    }
}
