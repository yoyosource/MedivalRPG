package de.medivalrpg.intromessages.Listener;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;

public class JoinListener implements Listener {

    @EventHandler
    public void onDrink(PlayerItemConsumeEvent e) {
        ItemStack itemStack = e.getItem();
        if (itemStack.getType() == Material.GLASS_BOTTLE) {

        }
    }

}
