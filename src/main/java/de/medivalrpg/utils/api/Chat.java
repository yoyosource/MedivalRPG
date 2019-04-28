package de.medivalrpg.utils.api;

import org.bukkit.entity.Player;

public class Chat {

    /**
     * Sends a Message to a Player
     * (World) to get the World of the Player
     * (Name) to get the Name of the Player
     *
     * @param p Player to send the Message to
     * @param String Your Message you want to Send
     * @param Prefix Your Prefix before the Message (Here you can use (World) and (Name) as String Parameters)
     * @param ColorConvert Set it to true if you want ColorConversion
     * @param SpecialConvert Set it to true if you want Bold or Rainbow Text
     */

    public static void sendchat(Player p, String String, String Prefix, Boolean ColorConvert, Boolean SpecialConvert) {
        Prefix = Prefix.replaceAll("\\(World\\)", p.getWorld().toString());
        Prefix = Prefix.replaceAll("\\(Name\\)", p.getName());
        Prefix = Prefix.replaceAll("&?", "");
        Prefix = Color.ConvertColor(Color.ConvertSpecial(Prefix));
        if (ColorConvert  == true && SpecialConvert == true) {
            String = Color.ConvertColor(Color.ConvertSpecial(String));
        } else if (ColorConvert  == false && SpecialConvert == true) {
            String = Color.ConvertSpecial(String);
        } else if (ColorConvert  == true && SpecialConvert == false) {
            String = Color.ConvertColor(String);
        } else {

        }
        p.sendMessage(Prefix + "§r" + String);
    }

    /**
     * Sends a Message to a Player
     * (World) to get the World of the Player
     * (Name) to get the Name of the Player
     * (Rank) to Replace it with the Rank you provide
     *
     * @param p Player to send the Message to
     * @param String Your Message you want to Send
     * @param Prefix Your Prefix before the Message (Here you can use (World) and (Name) as String Parameters)
     * @param ColorConvert Set it to true if you want ColorConversion
     * @param SpecialConvert Set it to true if you want Bold or Rainbow Text
     * @param Rank Your Rank you want to have in the Message
     */

    public static void sendchat(Player p, String String, String Prefix, Boolean ColorConvert, Boolean SpecialConvert, String Rank) {
        Prefix = Prefix.replaceAll("\\(World\\)", p.getWorld().toString());
        Prefix = Prefix.replaceAll("\\(Rank\\)", Rank);
        Prefix = Prefix.replaceAll("\\(Name\\)", p.getName());
        Prefix = Prefix.replaceAll("&?", "");
        Prefix = Color.ConvertColor(Color.ConvertSpecial(Prefix));
        if (ColorConvert  == true && SpecialConvert == true) {
            String = Color.ConvertColor(Color.ConvertSpecial(String));
        } else if (ColorConvert  == false && SpecialConvert == true) {
            String = Color.ConvertSpecial(String);
        } else if (ColorConvert  == true && SpecialConvert == false) {
            String = Color.ConvertColor(String);
        } else {

        }
        p.sendMessage(Prefix + "§r" + String);
    }

    /**
     * Sends a Message to a Player
     *
     * @param p Player to send the Message to
     * @param String Your Message you want to Send
     * @param ColorConvert Set it to true if you want ColorConversion
     * @param SpecialConvert Set it to true if you want Bold or Rainbwo Text
     */

    public static void sendchat(Player p, String String, Boolean ColorConvert, Boolean SpecialConvert) {
        if (ColorConvert  == true && SpecialConvert == true) {
            String = Color.ConvertColor(Color.ConvertSpecial(String));
        } else if (ColorConvert  == false && SpecialConvert == true) {
            String = Color.ConvertSpecial(String);
        } else if (ColorConvert  == true && SpecialConvert == false) {
            String = Color.ConvertColor(String);
        } else {

        }
        p.sendMessage( "§r" + String);
    }

    /**
     * Sends a Message to a Collection of Player (Player Array)
     * (World) to get the World of the Player
     * (Name) to get the Name of the Player
     *
     * @param all Players to send the Message to
     * @param p The Player that sends the Message (used to make the (World) and (Name))
     * @param String Your Message you want to Send
     * @param Prefix Your Prefix before the Message (Here you can use (World) and (Name) as String Parameters)
     * @param ColorConvert Set it to true if you want ColorConversion
     * @param SpecialConvert Set it to true if you want Bold or Rainbow Text
     */

    public static void sendchat(Player[] all, Player p, String String, String Prefix, Boolean ColorConvert, Boolean SpecialConvert) {
        Prefix = Prefix.replaceAll("\\(World\\)", p.getWorld().getName());
        Prefix = Prefix.replaceAll("\\(Name\\)", p.getName());
        Prefix = Prefix.replaceAll("&?", "");
        Prefix = Color.ConvertColor(Color.ConvertSpecial(Prefix));
        if (ColorConvert  == true && SpecialConvert == true) {
            String = Color.ConvertColor(Color.ConvertSpecial(String));
        } else if (ColorConvert  == false && SpecialConvert == true) {
            String = Color.ConvertSpecial(String);
        } else if (ColorConvert  == true && SpecialConvert == false) {
            String = Color.ConvertColor(String);
        } else {

        }
        for (Player reciever : all) {
            if (reciever != p) {
                reciever.sendMessage(Prefix + "§r" + String);
            }
        }
        p.sendMessage(Prefix + "§r" + String);
    }

    /**
     * Sends a Message to a Collection of Player (Player Array)
     *
     * (World) to get the World of the Player
     * (Name) to get the Name of the Player
     * (Rank) to Replace it with the Rank you provide
     *
     * @param all Players to send the Message to
     * @param p The Player that sends the Message (used to make the (World) and (Name))
     * @param String Your Message you want to Send
     * @param Prefix Your Prefix before the Message (Here you can use (World) and (Name) as String Parameters)
     * @param ColorConvert Set it to true if you want ColorConversion
     * @param SpecialConvert Set it to true if you want Bold or Rainbow Text
     * @param Rank Your Rank you want to have in the Message
     */

    public static void sendchat(Player[] all, Player p, String String, String Prefix, Boolean ColorConvert, Boolean SpecialConvert, String Rank) {
        Prefix = Prefix.replaceAll("\\(World\\)", p.getWorld().getName());
        Prefix = Prefix.replaceAll("\\(Rank\\)", Rank);
        Prefix = Prefix.replaceAll("\\(Name\\)", p.getName());
        Prefix = Prefix.replaceAll("&?", "");
        Prefix = Color.ConvertColor(Color.ConvertSpecial(Prefix));
        if (ColorConvert  == true && SpecialConvert == true) {
            String = Color.ConvertColor(Color.ConvertSpecial(String));
        } else if (ColorConvert  == false && SpecialConvert == true) {
            String = Color.ConvertSpecial(String);
        } else if (ColorConvert  == true && SpecialConvert == false) {
            String = Color.ConvertColor(String);
        } else {

        }
        for (Player reciever : all) {
            if (reciever != p) {
                reciever.sendMessage(Prefix + "§r" + String);
            }
        }
        p.sendMessage(Prefix + "§r" + String);
    }

    /**
     * Sends a Message to a Collection of Player (Player Array)
     *
     * @param all Player to send the Message to
     * @param p The Player that sends the Message
     * @param String Your Message you want to Send
     * @param ColorConvert Set it to true if you want ColorConversion
     * @param SpecialConvert Set it to true if you want Bold or Rainbow Text
     */

    public static void sendchat(Player[] all, Player p, String String, Boolean ColorConvert, Boolean SpecialConvert) {
        if (ColorConvert  == true && SpecialConvert == true) {
            String = Color.ConvertColor(Color.ConvertSpecial(String));
        } else if (ColorConvert  == false && SpecialConvert == true) {
            String = Color.ConvertSpecial(String);
        } else if (ColorConvert  == true && SpecialConvert == false) {
            String = Color.ConvertColor(String);
        } else {

        }
        for (Player reciever : all) {
            if (reciever != p) {
                reciever.sendMessage( "§7" + String);
            }
        }
        p.sendMessage( "§r" + String);
    }

}

