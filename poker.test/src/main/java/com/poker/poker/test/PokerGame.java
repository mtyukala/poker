/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poker.poker.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mt
 */
class PokerGame {

    private final Deck deck;
    private final Evaluator evaluator;
    private List<Card> hand;

    public PokerGame() {
        this.deck = new Deck();
        this.evaluator = new Evaluator();
        this.hand = new ArrayList<>();
    }


    void play() {
        this.deck.shuffle();
    }

    void draw() {
        this.hand = this.deck.deal(Utils.HAND_SIZE);
    }

    void score() {
        this.evaluator.evaluate(this.hand);
    }
}
