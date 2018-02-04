package me.syntaxable.clearchat;

import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.syntaxable.clearchat.commands.Command_clearchat;
import me.syntaxable.clearchat.commands.Command_clearchatforme;

public class ClearChatMain extends JavaPlugin {

	Permission pperm = new Permission("clearchat.admins.clearchat");
	
	@Override
	public void onEnable() {
		System.out.println("ClearChat has been enabled!");
		this.getCommand("clearchat").setExecutor(new Command_clearchat());
		this.getCommand("clearchatforme").setExecutor(new Command_clearchatforme());
		PluginManager pm = getServer().getPluginManager();
		pm.addPermission(pperm);

	}
	
	@Override
	public void onDisable() {
		System.out.println("ClearChat is disabled!");
		
	}
	
}
