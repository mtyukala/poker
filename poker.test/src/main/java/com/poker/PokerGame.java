package com.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mt
 */
class PokerGame implements GameInterface {

    private final Deck deck;
    private final Evaluator evaluator;
    private List<Card> hand;

    /**
     * Copy constructor to create a game instance from the given parameters
     *
     * @param deck the deck of cards to use for this game
     * @param evaluator the evaluator for the game
     * @param hand a list of card for the game
     */
    public PokerGame(Deck deck, Evaluator evaluator, List<Card> hand) {
        this.deck = deck;
        this.evaluator = evaluator;
        this.hand = new ArrayList<>();
    }


    @Override
    public void play() {
        this.deck.shuffle();
    }

    @Override
    public void draw() {
        this.hand = this.deck.deal(Utils.HAND_SIZE);
    }

    @Override
    public void reportScore() {
        String output = "";
        //Collections.sort(this.hand);
        Collections.sort(hand, (Card card1, Card card2) -> card1.compareTo(card2));

        output = this.hand.stream().map((card) -> card.toString() + " ").reduce(output, String::concat);
        System.out.println("Your Hand: " + output);
        System.out.println("You Have: " + this.evaluator.evaluate(this.hand));
    }
}
