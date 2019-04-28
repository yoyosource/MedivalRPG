package de.medivalrpg.drinks;

import de.medivalrpg.MedivalRPG;
import de.medivalrpg.drinks.Listener.DrinkListener;
import de.medivalrpg.moneysystem.MoneyUtil;
import org.bukkit.Bukkit;

public class DrinkSystem {

    private MedivalRPG plugin;
    private MoneyUtil moneyUtil;

    public DrinkSystem(MedivalRPG plugin) {
        this.plugin = plugin;
        this.moneyUtil = new MoneyUtil();
    }

    public void initialize() {
        Bukkit.getPluginManager().registerEvents(new DrinkListener(), plugin);
        //TODO register
    }

}
