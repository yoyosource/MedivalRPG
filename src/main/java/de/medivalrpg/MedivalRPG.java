package de.medivalrpg;

import org.bukkit.plugin.java.JavaPlugin;

public class MedivalRPG extends JavaPlugin {
    //Instance of class
    private MedivalRPG plugin;

    private Initializer initializer;

    @Override
    public void onEnable() {
        //Initialize instance of class
        this.plugin = this;

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

