package de.medivalrpg.moneysystem;

import net.minecraft.server.v1_12_R1.Item;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

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

    private ItemStack goldBlockItem() {

        goldBlockItem().setType(Material.GOLD_BLOCK);
        ItemMeta itemMeta = goldBlockItem().getItemMeta();
        itemMeta.setDisplayName(""); //TODO AZRA name
        goldBlockItem().setItemMeta(itemMeta);

        return goldBlockItem();
    }

    private ItemStack goldIngotItem() {

        goldIngotItem().setType(Material.GOLD_INGOT);
        ItemMeta itemMeta = goldIngotItem().getItemMeta();
        itemMeta.setDisplayName(""); //TODO AZRA name
        goldIngotItem().setItemMeta(itemMeta);

        return goldIngotItem();
    }

    private ItemStack goldNuggetItem() {

        goldNuggetItem().setType(Material.GOLD_NUGGET);
        ItemMeta itemMeta = goldNuggetItem().getItemMeta();
        itemMeta.setDisplayName(""); //TODO AZRA name
        goldNuggetItem().setItemMeta(itemMeta);

        return goldNuggetItem();
    }

    public void givePlayerMoney(Player player, int amount, PayOption payOptions) {
        if (player != null) {
            Inventory inventory = player.getInventory();
            switch (payOptions) {
                case ALL:
                    while (amount >= 1) {
                        if (amount >= 81) {
                            inventory.addItem(goldBlockItem());
                            amount -= 81;
                        } else if (amount >= 9) {
                            inventory.addItem(goldIngotItem());
                            amount -= 9;
                        } else {
                            inventory.addItem(goldNuggetItem());
                            amount--;
                        }
                    }
                    break;
                case ONLY_BLOCKS:
                    while (amount >= 81) {
                        inventory.addItem(goldBlockItem());
                        amount -= 81;
                    }
                    break;
                case ONLY_INGOTS:
                    while (amount >= 9) {
                        inventory.addItem(goldIngotItem());
                        amount -= 9;
                    }
                    break;
                case ONLY_NUGGETS:
                    while (amount >= 1) {
                        inventory.addItem(goldNuggetItem());
                        amount--;
                    }
                    break;
                case ONLY_BLOCKS_AND_INGOTS:
                    while (amount >= 9) {
                        if (amount >= 81) {
                            inventory.addItem(goldBlockItem());
                            amount -= 81;
                        } else if (amount >= 9) {
                            inventory.addItem(goldIngotItem());
                            amount -= 9;
                        }
                    }
                    break;
                case ONLY_BLOCKS_AND_NUGGETS:
                    while (amount >= 1) {
                        if (amount >= 81) {
                            inventory.addItem(goldBlockItem());
                            amount -= 81;
                        } else {
                            inventory.addItem(goldNuggetItem());
                            amount--;
                        }
                    }
                    break;
                case ONLY_INGOTS_AND_NUGGETS:
                    while (amount >= 1) {
                        if (amount >= 9) {
                            inventory.addItem(goldIngotItem());
                            amount -= 9;
                        } else {
                            inventory.addItem(goldNuggetItem());
                            amount--;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }

}
