/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poker;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author mt
 */
public class DeckTest {

    public DeckTest() {
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
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        Deck instance = new Deck(new ArrayList<>(), Utils.FACES, Utils.SUITS);
        List<Card> cards1 = new Deck(new ArrayList<Card>(), Utils.FACES, Utils.SUITS).getCards();
        instance.shuffle();
        List<Card> cards2 = instance.getCards();
        Assertions.assertNotEquals(cards1, cards2);
    }


    /**
     * Test of deal method, of class Deck.
     */
    @Test
    public void testDeal() {
        System.out.println("deal");
        int size = 0;
        Deck instance = new Deck(new ArrayList<>(), Utils.FACES, Utils.SUITS);
        List<Card> expResult = instance.getCards().subList(0, size);
        List<Card> result = instance.deal(size);
        assertEquals(expResult, result);
    }

}
