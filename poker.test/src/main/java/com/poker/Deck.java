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
    private final List<String> cardFaces;
    private final Map<String, String> cardSuit;
    /**
     * Copy constructor from the given parameters
     *
     * @param cards the initial list of cards from which to create an instance
     * @param faces the faces of cards from which to create a deck
     * @param suits the suits of cards from which to create a deck
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
     * Gets a sub list of the deck of cards of the given size. After dealing,
     * the method removes the sub list from the deck of cards
     *
     * @param size the size of the hand to deal
     * @return the sublist of cards
     */
    public List<Card> deal(int size) {
        List<Card> hand = cards.subList(0, size);

        cards.removeAll(hand); // --- remove the hand from the original card list

        return hand;
    }

}
