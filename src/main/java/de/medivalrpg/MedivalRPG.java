package de.medivalrpg;

import de.medivalrpg.drinks.DrinkSystem;
import de.medivalrpg.moneysystem.MoneySystem;
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

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
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

