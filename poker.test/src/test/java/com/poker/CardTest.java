/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poker;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author mt
 */
public class CardTest {

    public CardTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of equals method, of class Card.
     */
    @org.junit.jupiter.api.Test
    public void testEquals() {
        System.out.println("equals");
        Card other = new Card("C", "A", 13); // --- testing Ace of Club
        Card instance = new Card("D", "A", 13);
        boolean expResult = false;
        boolean result = instance.equals(other);
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class Card.
     */
    @org.junit.jupiter.api.Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Card card = new Card("C", "A", 13);
        Card instance = new Card("C", "A", 13);
        int expResult = 0;
        int result = instance.compareTo(card);
        assertEquals(expResult, result);
    }

}
