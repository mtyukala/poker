package com.poker.poker.test;

/**
 * Class to represent a card in the poker game
 * @author mt
 */
public class Card {
    private String suitFamily;
    private String face;


    /**
     * Constructor to create a card object from the given parameters
     * @param suitFamily the family to which the card belongs. Diamond, heart etc..
     * @param face the face of the card. Ace 2..10, J..Q etc
     */
    public Card(String suitFamily, String face) {
        this.suitFamily = suitFamily;
        this.face = face;
    }

    public String getSuitFamily() {
        return suitFamily;
    }

    public void setSuitFamily(String suitFamily) {
        this.suitFamily = suitFamily;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    @Override
    public String toString() {
        return Utils.FACES.get(Utils.FACES.indexOf(face)) + suitFamily;
    }




}
