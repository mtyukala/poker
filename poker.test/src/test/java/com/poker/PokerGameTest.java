/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poker;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author mt
 */
public class PokerGameTest {

    public PokerGameTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of play method, of class PokerGame.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        PokerGame instance = new PokerGame(new Deck(), new Evaluator(), new ArrayList<>());
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class PokerGame.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        PokerGame instance = new PokerGame(new Deck(), new Evaluator(), new ArrayList<>());
        instance.draw();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reportScore method, of class PokerGame.
     */
    @Test
    public void testReportScore() {
        System.out.println("reportScore");
        PokerGame instance = new PokerGame(new Deck(), new Evaluator(), new ArrayList<>());
        instance.reportScore();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
