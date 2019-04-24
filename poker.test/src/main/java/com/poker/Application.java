package com.poker;

import java.util.ArrayList;

/**
 *
 * @author mt
 */
public class Application {
    public static void main(String[] args) {
        PokerGame game = new PokerGame(new Deck(), new Evaluator(), new ArrayList<>());
        game.play();
        game.draw();
        game.reportScore();
    }

}
