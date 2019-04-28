package de.medivalrpg.moneysystem;

import de.medivalrpg.MedivalRPG;

public class MoneySystem {

    //System objectives
    private MedivalRPG plugin;
    private MoneyUtil moneyUtil;

    public MoneySystem(MedivalRPG plugin) {
        //Initialize system objectives
        this.plugin = plugin;
        this.moneyUtil = new MoneyUtil();
    }

    public void initialize() {
        //Register
        //TODO register
    }

    public MoneyUtil getMoneyUtil() {
        return moneyUtil;
    }
}
