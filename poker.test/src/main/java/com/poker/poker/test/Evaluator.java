/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poker.poker.test;

import java.util.Collections;
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
        if (hand.size() != 5) {
            return false;
        }

        sort(hand);   // Sort the cards by the suit values

        return (hand.get(0).getRank() == hand.get(4).getRank());
    }

    public static boolean isStraight(List<Card> hand) {

        int i, testRank;

        if (hand.size() != 5) {
            return false;
        }

        sort(hand);

        //---    Check if hand has an Ace
        if (hand.get(4).getRank() == 13) {

            // --- Check straight using an Ace
            boolean a = hand.get(0).getRank() == 1 && hand.get(1).getRank() == 2
                    && hand.get(2).getRank() == 3 && hand.get(3).getRank() == 5;

            boolean b = hand.get(0).getRank() == 9 && hand.get(1).getRank() == 10
                    && hand.get(2).getRank() == 11 && hand.get(3).getRank() == 12;

            return a || b;
        } else {

            // --- General case: check for increasing values
            testRank = hand.get(0).getRank() + 1;

            for (i = 1; i < hand.size(); i++) {
                if (hand.get(i).getRank() != testRank) {
                    return false;        // Straight failed...
                }
                testRank++;   // Next card in hand
            }

            return true;        // Straight found !
        }

    }

    public static void sort(List<Card> hand) {
        Collections.sort(hand, (Card card1, Card card2) -> card1.compareTo(card2));
    }
    public void evaluate(List<Card> hand) {
        sort(hand);
        hand.forEach((card) -> {
            System.out.println(card + " : " + card.getRank());
            //System.err.println(card.getRank());
        });
    }
}
