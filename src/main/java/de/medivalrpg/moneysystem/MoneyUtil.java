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

}
