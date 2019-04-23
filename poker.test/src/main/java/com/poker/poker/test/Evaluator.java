/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poker.poker.test;

import java.util.Collections;
import java.util.Comparator;
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

    public static void sortBySuit(List<Card> hand) {
        int index, j, min;

        for (index = 0; index < hand.size(); index++) {

            min = index;   // Assume elem i (h[i]) is the minimum

            for (j = index + 1; j < hand.size(); j++) {
                if (hand.get(index).getRank() < hand.get(min).getRank()) {
                    min = j;    // We found a smaller suit value, update min_j
                }
            }

            Card card = hand.get(index);

            hand.set(index, hand.get(min));
            hand.set(min, card);

        }
        hand.forEach((card) -> {
            System.err.println(card.getRank());
        });
    }
    public void evaluate(List<Card> hand) {
        Collections.sort(hand, new Comparator<Card>() {

            @Override
            public int compare(Card o1, Card o2) {

            }
        });

    }
}
