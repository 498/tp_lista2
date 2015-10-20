package karta;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author mcz
 *
 */
public class Deck {
  /**
   * 
   */
  private final List<Card> cards;

  Deck() {
    cards = new LinkedList<Card>();
    for (final Suit s : Suit.values()) {
      for (final Rank r : Rank.values()) {
        cards.add(new Card(s, r));
      }
    }
  }

  public int count() {
    return cards.size();
  }
  
  public void shuffle() {
    Collections.shuffle(cards, new Random(System.nanoTime()));
  }

  /**
   * 
   * @param card
   */
  public void addCardToDeck(final Card card) {
    cards.add(card);
  }

  /** 
   * .
   * @return 
   */
  public Card giveCardFromDeck() {
    final Card card = cards.get(0);
    cards.remove(0);
    return card;
  }

  /**
   * 
   * @param number Number of cards to get from Deck.
   * @return
   */
  public List<Card> giveNCardsFromDeck(final int number) {
    final List<Card> cards = new LinkedList<Card>();
    for (int i = 0; i < number; ++i) {
      cards.add(giveCardFromDeck());
    }
    return cards;
  }
}
