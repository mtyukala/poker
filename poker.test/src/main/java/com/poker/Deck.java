/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poker;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Class to define a deck of cards.
 *
 * @author mt
 */
public class Deck {

    private final List<Card> cards;
    private List<String> cardFaces;
    private Map<String, String> cardSuit;
    /**
     *
     * @param cards the value of cards
     */
    public Deck(List<Card> cards, List<String> faces, Map<String, String> suits) {
        this.cards = cards;
        this.cardFaces = faces;
        this.cardSuit = suits;

        initDeck();
    }


    /**
     * Creates a new list of cards using the suits and faces and shuffle them
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // --- initialises the deck of card to the faces and suits
    private void initDeck() {
        cardSuit.entrySet().forEach((entry) -> {
            cardFaces.forEach((face) -> {
                int index = cardFaces.indexOf(face);
                cards.add(new Card(entry.getValue(), face, index >= 0 ? index + 1 : 1));
            });
        });
    }

    /**
     * Return the list of cards
     *
     * @return list of cards on this deck
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
