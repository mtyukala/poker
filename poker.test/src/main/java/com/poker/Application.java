package com.poker;

/**
 *
 * @author mt
 */
public class Application {
    public static void main(String[] args) {
        PokerGame game = new PokerGame();
        game.play();
        game.draw();
        game.reportScore();
    }
    
}
