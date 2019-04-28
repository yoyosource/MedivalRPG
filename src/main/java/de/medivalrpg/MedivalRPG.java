package de.medivalrpg;

import de.medivalrpg.moneysystem.MoneySystem;
import org.bukkit.plugin.java.JavaPlugin;

public class MedivalRPG extends JavaPlugin {
    //Instance of class
    private MedivalRPG plugin;

    //MoneySystem object
    private MoneySystem moneySystem;

    private Initializer initializer;

    @Override
    public void onEnable() {
        //Initialize instance of class
        this.plugin = this;

        //Initialize moneySystem object
        this.moneySystem = new MoneySystem(plugin);

        moneySystem.initialize();

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

