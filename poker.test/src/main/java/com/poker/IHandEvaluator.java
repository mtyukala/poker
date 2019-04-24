package com.poker;

import java.util.List;

/**
 * Interface to define a class structure to evaluate a given a hand of a game
 *
 * @author mt
 */
public interface IHandEvaluator {

    /**
     * checks the strength of the given hand against the standard t card poker
     * hand strength.
     *
     * @param hand the hand to check
     * @return a String indicating on the strength of the hand
     */
    String evaluate(List<Card> hand);

}
