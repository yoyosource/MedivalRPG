package de.medivalrpg.utils.api;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

/**
 * Effects is to Create and Manipulate Effects.
 */

public class Effects {

    /**
     * Create a Effect.
     *
     * @param e Your Potion Effect
     * @param duration Effect Duration
     * @param amplifier Effect Amplifier
     * @param ambient Effect Ambient
     * @param particles Effect Particle
     * @return Your Effect
     */

    public static PotionEffect createEffect(PotionEffectType e, Integer duration, Integer amplifier, Boolean ambient, Boolean particles) {
        PotionEffect effect = new PotionEffect(e, duration, amplifier, ambient, particles);
        return effect;
    }

    /**
     * Get the Effect of the Player.
     *
     * @param p Your Player
     * @return Your Effect the Player have
     */

    public static PotionEffectType[] getEffects(Player p) {
        p.getActivePotionEffects();
        int j = 0;
        if (p.hasPotionEffect(PotionEffectType.ABSORPTION)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.BLINDNESS)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.CONFUSION)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.DAMAGE_RESISTANCE)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.FAST_DIGGING)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.FIRE_RESISTANCE)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.GLOWING)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.HARM)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.HEAL)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.HEALTH_BOOST)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.HUNGER)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.INCREASE_DAMAGE)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.INVISIBILITY)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.JUMP)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.LEVITATION)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.LUCK)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.NIGHT_VISION)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.POISON)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.REGENERATION)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.SATURATION)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.SLOW)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.SLOW_DIGGING)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.SPEED)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.UNLUCK)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.WATER_BREATHING)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.WEAKNESS)) {
            j++;
        }
        if (p.hasPotionEffect(PotionEffectType.WITHER)) {
            j++;
        }
        PotionEffectType[] effects = new PotionEffectType[j];
        int i = 0;
        if (p.hasPotionEffect(PotionEffectType.ABSORPTION)) {
            effects[i] = PotionEffectType.ABSORPTION;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.BLINDNESS)) {
            effects[i] = PotionEffectType.BLINDNESS;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.CONFUSION)) {
            effects[i] = PotionEffectType.CONFUSION;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.DAMAGE_RESISTANCE)) {
            effects[i] = PotionEffectType.DAMAGE_RESISTANCE;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.FAST_DIGGING)) {
            effects[i] = PotionEffectType.FAST_DIGGING;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.FIRE_RESISTANCE)) {
            effects[i] = PotionEffectType.FIRE_RESISTANCE;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.GLOWING)) {
            effects[i] = PotionEffectType.GLOWING;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.HARM)) {
            effects[i] = PotionEffectType.HARM;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.HEAL)) {
            effects[i] = PotionEffectType.HEAL;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.HEALTH_BOOST)) {
            effects[i] = PotionEffectType.HEALTH_BOOST;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.HUNGER)) {
            effects[i] = PotionEffectType.HUNGER;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.INCREASE_DAMAGE)) {
            effects[i] = PotionEffectType.INCREASE_DAMAGE;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.INVISIBILITY)) {
            effects[i] = PotionEffectType.INVISIBILITY;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.JUMP)) {
            effects[i] = PotionEffectType.JUMP;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.LEVITATION)) {
            effects[i] = PotionEffectType.LEVITATION;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.LUCK)) {
            effects[i] = PotionEffectType.LUCK;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.NIGHT_VISION)) {
            effects[i] = PotionEffectType.NIGHT_VISION;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.POISON)) {
            effects[i] = PotionEffectType.POISON;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.REGENERATION)) {
            effects[i] = PotionEffectType.REGENERATION;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.SATURATION)) {
            effects[i] = PotionEffectType.SATURATION;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.SLOW)) {
            effects[i] = PotionEffectType.SLOW;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.SLOW_DIGGING)) {
            effects[i] = PotionEffectType.SLOW_DIGGING;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.SPEED)) {
            effects[i] = PotionEffectType.SPEED;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.UNLUCK)) {
            effects[i] = PotionEffectType.UNLUCK;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.WATER_BREATHING)) {
            effects[i] = PotionEffectType.WATER_BREATHING;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.WEAKNESS)) {
            effects[i] = PotionEffectType.WEAKNESS;
            i++;
        }
        if (p.hasPotionEffect(PotionEffectType.WITHER)) {
            effects[i] = PotionEffectType.WITHER;
            i++;
        }
        return effects;
    }

    /**
     * Give a PotionEffect to Somebody.
     *
     * @param Potion Your Potion Effect to give
     * @param p Your Player that recieves the Potion Effect
     */

    public static void giveEffect(PotionEffect Potion, Player p) {
        p.addPotionEffect(Potion);
    }

    /**
     * Give a PotionEffect to Somebody.
     *
     * @param Potions Your Potions to give
     * @param p Your Player that recieves the Potions
     */

    public static void giveEffect(PotionEffect[] Potions, Player p) {
        for (PotionEffect Potion : Potions) {
            p.addPotionEffect(Potion);
        }
    }

    /**
     * Give a PotionEffect to Somebody.
     *
     * @param Potion Your Potion Effect to give
     * @param ps Your Players to recieve the Potion Effect
     */

    public static void giveEffect(PotionEffect Potion, Player[] ps) {
        for (Player p : ps) {
            p.addPotionEffect(Potion);
        }
    }

    /**
     * Give a PotionEffect to Somebody.
     *
     * @param Potions Your Potions to give
     * @param ps Your Players to recieve the Potion Effects
     */

    public static void giveEffect(PotionEffect[] Potions, Player[] ps) {
        for (Player p : ps) {
            for (PotionEffect potion : Potions) {
                p.addPotionEffect(potion);
            }
        }
    }

}
