package de.medivalrpg.utils.api;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;

/**
 * Get The Player from a Name or the UUID or get Every Player.
 */

public class GetPlayer {

    /**
     * Get The Player.
     *
     * @param Player Your name of the Player
     * @return Your Player
     */

    public static Player toPlayer(String Player) {
        Player e = null;
        for (Player p : Bukkit.getOnlinePlayers()) {
            if (p.getPlayer().getName().equals(Player)) {
                e = p;
            }
        }
        return e;
    }

    /**
     * Get The Player.
     *
     * @param Player Your UUID of the Player
     * @return Your Player
     */

    public static Player toPlayer(UUID Player) {
        Player e = null;
        for (Player p : Bukkit.getOnlinePlayers()) {
            if (p.getUniqueId().equals(Player)) {
                e = p;
            }
        }
        return e;
    }

    /**
     * Get Every online Player.
     *
     * @return Your Player Array
     */

    public static Player[] onlinePlayers() {
        Player[] Online = new Player[Bukkit.getOnlinePlayers().size()];
        Integer PlayerIndex = 0;
        for (Player all: Bukkit.getOnlinePlayers()) {
            Online[PlayerIndex] = all;
            PlayerIndex++;
        }
        return Online;
    }

}

