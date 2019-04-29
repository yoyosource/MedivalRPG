package de.medivalrpg.moneysystem;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MoneyUtil {

    public int getMoneyFromPlayerInventory(Player player) {
        if (player != null) {
            Inventory inventory = player.getInventory();
            ItemStack[] itemStacks = inventory.getContents();
            int playerMoney = 0;
            for (ItemStack itemStack : itemStacks) {
                if (itemStack.getType() != null)
                    if (itemStack != null) {
                        switch (itemStack.getType()) {
                            case GOLD_NUGGET:
                                playerMoney++;
                                break;
                            case GOLD_INGOT:
                                playerMoney += 9;
                                break;
                            case GOLD_BLOCK:
                                playerMoney += 81;
                                break;
                            default:
                                break;
                        }
                    }
            }
            return playerMoney;
        }
        return 0;
    }

    public void givePlayerMoney(Player player, int amount, PayOption payOptions) {
        if (player != null) {
            Inventory inventory = player.getInventory();
            switch (payOptions) {
                case ALL:
                    while (amount > 0) {
                        if (amount >= 81) {
                            inventory.addItem();
                        } else if (amount >= 9) {

                        } else {

                        }
                    }
                    break;
                case ONLY_BLOCKS:
                    break;
                case ONLY_INGOTS:
                    break;
                case ONLY_NUGGETS:
                    break;
                default:
                    break;
            }
        }
    }

}
