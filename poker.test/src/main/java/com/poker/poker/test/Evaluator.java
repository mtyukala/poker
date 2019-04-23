/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poker.poker.test;

import java.util.List;

/**
 *
 * @author mt
 */
public class Evaluator {


    public static boolean isFourOfKind(List<Card> hand) {
        return false;
    }

    public static boolean isFullHouse(List<Card> hand) {
        return false;
    }

    public static boolean isThreeOfKind(List<Card> hand) {
        return false;
    }

    public static boolean isTwoPair(List<Card> hand) {
        return false;
    }

    public static boolean isOnePair(List<Card> hand) {
        return false;
    }

    public static boolean isHighCards(List<Card> hand) {
        return false;
    }

    public static boolean isFlush(List<Card> hand) {
        return false;
    }

    public static boolean isStraight(List<Card> hand) {
        return false;
    }

    public static void sortBySuit(List<Card> h) {
        int i, j, min_j;

        for (i = 0; i < h.size(); i++) {

            min_j = i;   // Assume elem i (h[i]) is the minimum

            for (j = i + 1; j < h.size(); j++) {
                if (h[j].suit() < h[min_j].suit()) {
                    min_j = j;    // We found a smaller suit value, update min_j
                }
            }

            Card help = h.get(i);

            h.set(i, h.get(min_j));
            h.set(min_j, help);
        }
    }
    public void evaluate(List<Card> hand) {
        System.err.println("not implemented yet");
    }
}
