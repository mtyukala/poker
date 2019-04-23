/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poker.poker.test;

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

    public void shuffle() {
        Utils.SUITS.entrySet().forEach((entry) -> {
            Utils.FACES.forEach((face) -> {
                cards.add(new Card(entry.getValue(), face));
            });
        });
        Collections.shuffle(cards);
    }

    public List<Card> getCards() {
        return Collections.unmodifiableList(cards);
    }

    public List<Card> deal(int size) {
        return cards.subList(0, size);
    }

}
