/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poker;

import java.util.List;

/**
 *
 * @author mt
 */
public interface ScoringSystem {

    boolean isFlush(List<Card> hand);

    boolean isFourOfKind(List<Card> hand);

    boolean isFullHouse(List<Card> hand);

    boolean isHighCards(List<Card> hand);

    boolean isOnePair(List<Card> hand);

    boolean isStraight(List<Card> hand);

    boolean isStraightFlush(List<Card> hand);

    boolean isThreeOfKind(List<Card> hand);

    boolean isTwoPair(List<Card> hand);

}
