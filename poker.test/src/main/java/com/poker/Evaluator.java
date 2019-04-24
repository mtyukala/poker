/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poker;

import java.util.Collections;
import java.util.List;

/**
 * Class to evaluate a given poker card. The class defines a number of useful
 * methods to compare the rankings of each of the cards in the hand
 *
 * @author mt
 */
public class Evaluator {

    public static boolean isFourOfKind(List<Card> hand) {
        if (hand.size() != 5) {
            return false;
        }

        sort(hand);

        //--- Check for: 4 cards of the same rank + higher ranked unmatched card
        boolean a1 = hand.get(0).getRank() == hand.get(1).getRank()
                && hand.get(1).getRank() == hand.get(2).getRank()
                && hand.get(2).getRank() == hand.get(3).getRank();


        //--- Check for: lower ranked unmatched card + 4 cards of the same rank
        boolean a2 = hand.get(1).getRank() == hand.get(2).getRank()
                && hand.get(2).getRank() == hand.get(3).getRank()
                && hand.get(3).getRank() == hand.get(4).getRank();

        return a1 || a2;
    }

    public static boolean isFullHouse(List<Card> hand) {
        if (hand.size() != 5) {
            return false;
        }

        sort(hand);

        //--- Check for: xxxyy
        boolean a1 = hand.get(0).getRank() == hand.get(1).getRank()
                && hand.get(1).getRank() == hand.get(2).getRank()
                && hand.get(3).getRank() == hand.get(4).getRank();

        //--- Check for: xxyyy
        boolean a2 = hand.get(0).getRank() == hand.get(1).getRank()
                && hand.get(2).getRank() == hand.get(3).getRank()
                && hand.get(3).getRank() == hand.get(4).getRank();

        return a1 || a2;
    }

    public static boolean isThreeOfKind(List<Card> hand) {
        if (hand.size() != 5) {
            return false;
        }

        sort(hand);

        if (isFourOfKind(hand) || isFullHouse(hand)) {
            return false;
        }

        //--- Check for: xxxab
        boolean a1 = hand.get(0).getRank() == hand.get(1).getRank()
                && hand.get(1).getRank() == hand.get(2).getRank();

        //--- Check for: axxxb
        boolean a2 = hand.get(1).getRank() == hand.get(2).getRank()
                && hand.get(2).getRank() == hand.get(3).getRank();

        //--- Check for: abxxx
        boolean a3 = hand.get(2).getRank() == hand.get(3).getRank()
                && hand.get(3).getRank() == hand.get(4).getRank();

        return a1 || a2 || a3;
    }

    public static boolean isTwoPair(List<Card> hand) {
        if (hand.size() != 5) {
            return false;
        }

        sort(hand);

        if (isFourOfKind(hand) || isFullHouse(hand) || isThreeOfKind(hand)) {
            return false;
        }

        //--- Check for: aaxyz
        boolean a1 = hand.get(0).getRank() == hand.get(1).getRank()
                && hand.get(2).getRank() == hand.get(3).getRank();

        //--- Check for: xaayz
        boolean a2 = hand.get(0).getRank() == hand.get(1).getRank()
                && hand.get(3).getRank() == hand.get(4).getRank();

        //--- Check for: xzyaa
        boolean a3 = hand.get(1).getRank() == hand.get(2).getRank()
                && hand.get(3).getRank() == hand.get(4).getRank();

        return a1 || a2 || a3;
    }

    public static boolean isOnePair(List<Card> hand) {
        if (hand.size() != 5) {
            return false;
        }

        sort(hand);

        if (isFourOfKind(hand) || isFullHouse(hand) || isThreeOfKind(hand) || isTwoPair(hand)) {
            return false;
        }

        return hand.get(0).getRank() == hand.get(1).getRank()
                || hand.get(1).getRank() == hand.get(2).getRank()
                || hand.get(2).getRank() == hand.get(3).getRank()
                || hand.get(3).getRank() == hand.get(4).getRank();

    }

    public static boolean isHighCards(List<Card> hand) {
        // --- Any hand which doesn't qualify as any one of the above hands.
        return !(isFlush(hand)
                || isFullHouse(hand)
                || isFourOfKind(hand)
                || isThreeOfKind(hand)
                || isTwoPair(hand)
                || isOnePair(hand)
                || isStraight(hand)
                || isStraightFlush(hand));
    }

    public static boolean isStraightFlush(List<Card> hand) {
        return isStraight(hand) && isFlush(hand);
    }
    public static boolean isFlush(List<Card> hand) {
        if (hand.size() != 5) {
            return false;
        }

        sort(hand);

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

    /**
     * checks the strength of the given hand against the standard t card poker
     * hand strength.
     *
     * @param hand the hand to check
     * @return a String indicating on the strength of the hand
     */
    public String evaluate(List<Card> hand) {
        if (isStraightFlush(hand)) {
            return "Straight Flush";
        }
        if (isFourOfKind(hand)) {
            return "Four of a Kind";
        }
        if (isFullHouse(hand)) {
            return "Full House";
        }
        if (isFlush(hand)) {
            return "Flush";
        }
        if (isStraight(hand)) {
            return "Straight";
        }
        if (isThreeOfKind(hand)) {
            return "Three of A Kind";
        }
        if (isTwoPair(hand)) {
            return "Two Pair";
        }
        if (isOnePair(hand)) {
            return "One Pair";
        }
        return "High Cards";
    }
}
