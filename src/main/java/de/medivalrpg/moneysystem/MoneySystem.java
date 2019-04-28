package de.medivalrpg.moneysystem;

import de.medivalrpg.MedivalRPG;

public class MoneySystem {

    private MedivalRPG plugin;
    private MoneyUtil moneyUtil;

    public MoneySystem(MedivalRPG plugin) {
        this.plugin = plugin;
        this.moneyUtil = new MoneyUtil();
    }

    public void initialize() {
        moneyUtil.test();
        //TODO register
    }



}
