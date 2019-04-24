package com.poker;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mt
 */
public class Application {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        final Deck deck = new Deck(cards, Utils.FACES, Utils.SUITS);
        final Evaluator evaluator = new Evaluator();
        final List<Card> hand = new ArrayList<>();

        PokerGame game = new PokerGame(deck, evaluator, hand);
        game.play();
        game.draw();
        game.reportScore();
    }
}
