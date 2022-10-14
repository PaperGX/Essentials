package fr.papergx.essentials.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandManager implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!(commandSender instanceof Player)) {return false;}
        Player player= (Player) commandSender;
        if(command.getName().equalsIgnoreCase("gm")) {CommandGM.doGM(player, s, strings);}
        if(command.getName().equalsIgnoreCase("gmc")) {CommandGM.doGMC(player, s, strings);}
        if(command.getName().equalsIgnoreCase("gms")) {CommandGM.doGMS(player, s, strings);}
        if(command.getName().equalsIgnoreCase("gmsp")) {CommandGM.doGMSP(player, s, strings);}
        if(command.getName().equalsIgnoreCase("feed")) {CommandFeed.doFEED(player, s, strings);}
        return false;
    }
}
