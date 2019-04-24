package com.poker;

import java.io.Serializable;

/**
 * Class to represent a card in the poker game
 * @author mt
 */
public class Card implements Serializable, Comparable<Card> {

    private static final long serialVersionUID = 1L;
    private static final int HASH = 37;

    private String suitFamily;
    private String face;
    private int rank; // --- rank is currently the index of the card in Util.FACES

    /**
     * Default constructor to create a card instance
     */
    public Card() {
        this.suitFamily = "";
        this.face = "";
        this.rank = 0;
    }

    /**
     * Constructor to create a card object from the given parameters
     * @param suitFamily the family to which the card belongs. Diamond, heart etc..
     * @param face the face of the card. Ace 2..10, J..Q etc
     * @param rank rank of the card in Utils.FACES
     */
    public Card(String suitFamily, String face, int rank) {
        this.suitFamily = suitFamily;
        this.face = face;
        this.rank = rank;
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

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }


    @Override
    public String toString() {
        return Utils.FACES.get(Utils.FACES.indexOf(face)) + suitFamily;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof Card)) {
            return false;
        }
        Card card = (Card) other;
        return this.rank == card.getRank()
                && this.face.equals(card.getRank())
                && this.suitFamily.equals(card.getSuitFamily());
    }

    @Override
    public int compareTo(Card card) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;

        if (this == card) {
            return EQUAL;
        }

        if (this.rank < card.getRank()) {
            return BEFORE;
        }
        if (this.rank > card.getRank()) {
            return AFTER;
        }

        int compare = face.compareTo(card.getFace());
        if (compare != EQUAL) {
            return compare;
        }

        compare = (suitFamily.compareTo(card.getSuitFamily()));
        if (compare != EQUAL) {
            return compare;
        }
        return EQUAL;
    }
    @Override
    public int hashCode() {
        return HASH * this.rank;
    }


}
