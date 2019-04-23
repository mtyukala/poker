/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poker.poker.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mt
 */
public class Utils {

    public static final Map<String, String> SUITS = new HashMap<String, String>() {
        {
            put("C", "\u2667");
            put("D", "\u2662");
            put("H", "\u2661");
            put("S", "\u2664");
        }
    };

    /**
     *
     */
    private static final String[] array = {
        "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"
    };
    public static final List<String> FACES = new ArrayList<>(Arrays.asList(array));
    public static final String[] HANDS = {"Straight Flush", "Four of a Kind", "Full House", "Flush",
         "Straight", "Three of a Kind", "Two Pair", "One Pair", "High Cards"};
        
    
}
