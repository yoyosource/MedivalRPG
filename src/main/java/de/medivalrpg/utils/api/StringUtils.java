package de.medivalrpg.utils.api;

import java.util.ArrayList;

/**
 * String manipulates and manages Strings.
 */

public class StringUtils {

    /**
     * Converts a String List or Array to an String.
     *
     * @param string Your String List
     * @return Your String
     */

    public static String mergeString(String[] string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length; i++) {
            stringBuilder.append(string[i]);
            if (i < string.length) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Splits a String at a certain Character.
     *
     * @param string Your String to Split
     * @param splitChar Your Char to Split at
     * @return Your Splitted String Array
     */

    public static String[] splitString(String string, char splitChar) {
        String[] worlds;
        char[] chars = string.toCharArray();
        char[] ch = new char[1];
        ArrayList<String> words = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        int lastSplit = 0;
        while (i < chars.length) {
            char c = chars[i];
            if (c != splitChar) {
                stringBuilder.append(c);
            } else {
                words.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
                lastSplit = i;
            }
            i++;
        }
        if (lastSplit != string.length()) {
            words.add(stringBuilder.toString());
        }
        return words.toArray(new String[0]);
    }

    /**
     * Splits a String at a certain Character.
     *
     * @param string Your String to Split
     * @param splitChar Your Char to Split at
     * @return Your Splitted String Array
     */

    public static String[] splitString(String string, char splitChar, Boolean ReviveSplitted) {
        String[] worlds;
        char[] chars = string.toCharArray();
        char[] ch = new char[1];
        ArrayList<String> words = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        int lastSplit = 0;
        while (i < chars.length) {
            char c = chars[i];
            if (c != splitChar) {
                stringBuilder.append(c);
            } else {
                words.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
                if (ReviveSplitted == true) {
                    stringBuilder.append(c);
                    words.add(stringBuilder.toString());
                    stringBuilder = new StringBuilder();
                }
                lastSplit = i;
            }
            i++;
        }
        if (lastSplit != string.length()) {
            words.add(stringBuilder.toString());
        }
        return words.toArray(new String[0]);
    }

    /**
     * Splits a String at certain Characters.
     *
     * @param string Your String to Split
     * @param splitChars Your Chars to Split at
     * @return Your Splitted String Array
     */

    public static String[] splitString(String string, char[] splitChars) {
        char[] chars = string.toCharArray();
        ArrayList<String> words = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        int lastSplit = 0;
        while (i < chars.length) {
            char c = chars[i];
            int splitCharTest = 0;
            for (char splitChar : splitChars) {
                if (c == splitChar) {
                    splitCharTest++;
                }
            }
            if (splitCharTest == 0) {
                stringBuilder.append(c);
            } else {
                words.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
                lastSplit = i;
            }
            i++;
        }
        if (lastSplit != string.length()) {
            words.add(stringBuilder.toString());
        }
        return words.toArray(new String[0]);
    }

    /**
     * Splits a String at certain Characters.
     *
     * @param string Your String to Split
     * @param splitChars Your Chars to Split at
     * @return Your Splitted String Array
     */

    public static String[] splitString(String string, char[] splitChars, Boolean ReviveSplitted) {
        char[] chars = string.toCharArray();
        ArrayList<String> words = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        int lastSplit = 0;
        while (i < chars.length) {
            char c = chars[i];
            int splitCharTest = 0;
            for (char splitChar : splitChars) {
                if (c == splitChar) {
                    splitCharTest++;
                }
            }
            if (splitCharTest == 0) {
                stringBuilder.append(c);
            } else {
                words.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
                if (ReviveSplitted == true) {
                    stringBuilder.append(c);
                    words.add(stringBuilder.toString());
                    stringBuilder = new StringBuilder();
                }
                lastSplit = i;
            }
            i++;
        }
        if (lastSplit != string.length()) {
            words.add(stringBuilder.toString());
        }
        return words.toArray(new String[0]);
    }

}

