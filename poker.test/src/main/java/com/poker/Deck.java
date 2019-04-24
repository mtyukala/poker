/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class to define a deck of cards.
 *
 * @author mt
 */
public class Deck {

    private final List<Card> cards = new ArrayList<>();

    /**
     * Creates a new list of cards using the suits and faces and shuffle them
     */
    public void shuffle() {
        Utils.SUITS.entrySet().forEach((entry) -> {
            Utils.FACES.forEach((face) -> {
                int index = Utils.FACES.indexOf(face);
                cards.add(new Card(entry.getValue(), face, index >= 0 ? index + 1 : 1));
            });
        });
        Collections.shuffle(cards);
    }
    /**
     * Return the list of cards
     *
     * @return
     */
    public List<Card> getCards() {
        return cards;
    }
    /**
     * Gets a sub list of the deck of cards
     *
     * @param size
     * @return
     */
    public List<Card> deal(int size) {
        return cards.subList(0, size);
    }

}
