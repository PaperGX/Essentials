package fr.papergx.essentials;

import fr.papergx.essentials.command.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("gm").setExecutor(new CommandManager());
        getCommand("gmc").setExecutor(new CommandManager());
        getCommand("gms").setExecutor(new CommandManager());
        getCommand("gmsp").setExecutor(new CommandManager());
        getCommand("feed").setExecutor(new CommandManager());
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
