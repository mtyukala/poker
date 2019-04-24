/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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
     * Test of getSuitFamily method, of class Card.
     */
    @org.junit.jupiter.api.Test
    public void testGetSuitFamily() {
        System.out.println("getSuitFamily");
        Card instance = null;
        String expResult = "";
        String result = instance.getSuitFamily();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSuitFamily method, of class Card.
     */
    @org.junit.jupiter.api.Test
    public void testSetSuitFamily() {
        System.out.println("setSuitFamily");
        String suitFamily = "";
        Card instance = null;
        instance.setSuitFamily(suitFamily);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFace method, of class Card.
     */
    @org.junit.jupiter.api.Test
    public void testGetFace() {
        System.out.println("getFace");
        Card instance = null;
        String expResult = "";
        String result = instance.getFace();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFace method, of class Card.
     */
    @org.junit.jupiter.api.Test
    public void testSetFace() {
        System.out.println("setFace");
        String face = "";
        Card instance = null;
        instance.setFace(face);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRank method, of class Card.
     */
    @org.junit.jupiter.api.Test
    public void testGetRank() {
        System.out.println("getRank");
        Card instance = null;
        int expResult = 0;
        int result = instance.getRank();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRank method, of class Card.
     */
    @org.junit.jupiter.api.Test
    public void testSetRank() {
        System.out.println("setRank");
        int rank = 0;
        Card instance = null;
        instance.setRank(rank);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Card.
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        System.out.println("toString");
        Card instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Card.
     */
    @org.junit.jupiter.api.Test
    public void testEquals() {
        System.out.println("equals");
        Object other = null;
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.equals(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Card.
     */
    @org.junit.jupiter.api.Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Card card = null;
        Card instance = null;
        int expResult = 0;
        int result = instance.compareTo(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
