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

        Bukkit.getServer().broadcastMessage(ChatColor.AQUA+"Starting RPG-System....");
        Bukkit.getServer().broadcastMessage(ChatColor.AQUA+" ________  ________  ________  ________       ___    ___ ________      \n");
        Bukkit.getServer().broadcastMessage(ChatColor.AQUA+"|\\   __  \\|\\   __  \\|\\   ____\\|\\   ____\\     |\\  \\  /  /|\\   ____\\     \n");
        Bukkit.getServer().broadcastMessage(ChatColor.AQUA+"\\ \\  \\|\\  \\ \\  \\|\\  \\ \\  \\___|\\ \\  \\___|_    \\ \\  \\/  / | \\  \\___|_    \n");
        Bukkit.getServer().broadcastMessage(ChatColor.AQUA+" \\ \\   _  _\\ \\   ____\\ \\  \\  __\\ \\_____  \\    \\ \\    / / \\ \\_____  \\   \n");
        Bukkit.getServer().broadcastMessage(ChatColor.AQUA+"  \\ \\  \\\\  \\\\ \\  \\___|\\ \\  \\|\\  \\|____|\\  \\    \\/  /  /   \\|____|\\  \\  \n");
        Bukkit.getServer().broadcastMessage(ChatColor.AQUA+"   \\ \\__\\\\ _\\\\ \\__\\    \\ \\_______\\____\\_\\  \\ __/  / /       ____\\_\\  \\ \n");
        Bukkit.getServer().broadcastMessage(ChatColor.AQUA+"    \\|__|\\|__|\\|__|     \\|_______|\\_________\\\\___/ /       |\\_________\\\n");
        Bukkit.getServer().broadcastMessage(ChatColor.AQUA+"                                 \\|_________\\|___|/        \\|_________|\n");
        Bukkit.getServer().broadcastMessage(ChatColor.AQUA+"                                                                       ");

    }

    @Override
    public void onDisable() {
        System.out.println("BYE");
        System.out.println("lol");
    }

    public MoneySystem getMoneySystem() {
        return moneySystem;
    }
}

