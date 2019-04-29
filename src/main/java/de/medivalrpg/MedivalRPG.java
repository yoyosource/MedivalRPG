package de.medivalrpg;

import de.medivalrpg.drinks.DrinkSystem;
import de.medivalrpg.moneysystem.MoneySystem;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class MedivalRPG extends JavaPlugin {
    //Instance of class
    private MedivalRPG plugin;

    //System objects
    private MoneySystem moneySystem;
    private DrinkSystem drinkSystem;

    @Override
    public void onEnable() {
        //Initialize instance of class
        this.plugin = this;

        //Initialize System objects
        this.moneySystem = new MoneySystem(plugin);
        this.drinkSystem = new DrinkSystem(plugin);

        moneySystem.initialize();
        drinkSystem.initialize();

        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.AQUA+"Starting RPG-System....");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.AQUA+" __     __     ______     ______     ______   ______     ______     __  __     ______    ");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.AQUA+"/\\ \\  _ \\ \\   /\\___  \\   /\\  == \\   /\\  == \\ /\\  ___\\   /\\  ___\\   /\\ \\_\\ \\   /\\  ___\\   ");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.AQUA+"\\ \\ \\/ \".\\ \\  \\/_/  /__  \\ \\  __<   \\ \\  _-/ \\ \\ \\__ \\  \\ \\___  \\  \\ \\____ \\  \\ \\___  \\  ");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.AQUA+" \\ \\__/\".~\\_\\   /\\_____\\  \\ \\_\\ \\_\\  \\ \\_\\    \\ \\_____\\  \\/\\_____\\  \\/\\_____\\  \\/\\_____\\ ");
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.AQUA+"  \\/_/   \\/_/   \\/_____/   \\/_/ /_/   \\/_/     \\/_____/   \\/_____/   \\/_____/   \\/_____/ \n");

    }

    @Override
    public void onDisable() {
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED+"Stopping RPG_System...");
    }

    public MoneySystem getMoneySystem() {
        return moneySystem;
    }
}

