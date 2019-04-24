package com.poker;

/**
 * Interface to represent a card game
 *
 * @author mt
 */
public interface GameInterface {
    /**
     * Draw cards from the deck and update the hand
     */
    void draw();

    /**
     * Shuffles the deck if cards
     */
    void play();

    /**
     * Writes the report of the score for the given hand on the screen
     */
    void reportScore();

}
