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

    private Initializer initializer;

    @Override
    public void onEnable() {
        //Initialize instance of class
        this.plugin = this;

        //Initialize System object
        this.moneySystem = new MoneySystem(plugin);
        this.drinkSystem = new DrinkSystem(plugin);

        moneySystem.initialize();
        drinkSystem.initialize();

        this.initializer = new Initializer(this.plugin);

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

}

