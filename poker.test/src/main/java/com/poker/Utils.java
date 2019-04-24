/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class to define useful utility methods and constants
 *
 * @author mt
 */
public class Utils {

    // --- the suit of a given deck of cards
    public static final Map<String, String> SUITS = new HashMap<String, String>() {
        {
            put("C", "\u2667");
            put("D", "\u2662");
            put("H", "\u2661");
            put("S", "\u2664");
        }
    };

    // --- The face of a given deck of cards. Assumption:
    // --- The cards are ranked (from high to low) Ace, King, Queen, Jack, 10, 9, 8, 7, 6, 5, 4, 3, 2.
    private static final String[] array = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"
    };
    public static final List<String> FACES = new ArrayList<>(Arrays.asList(array));

    // --- the poker game hands strenth
    public static final String[] HANDS = {
        "Straight Flush", "Four of a Kind", "Full House", "Flush",
        "Straight", "Three of a Kind", "Two Pair", "One Pair", "High Cards"
    };

    // --- default hand size for a poker game
    public static final int HAND_SIZE = 5;

}
