package karta;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DeckTest {
  private Deck deck;
  final int fullDeckSize = Suit.values().length * Rank.values().length;
  
  @Before
  public final void setUp() {
    deck = new Deck();
  }

  @Test
  public final void testDeck_isFull_true() {
    assertEquals(deck.count(), fullDeckSize);
  }
  
  @Test
  public final void testShuffle_isPermutation_true() {
    deck.shuffle();
    assertEquals(deck.count(), fullDeckSize);
  }
  
  @Test
  public final void testAddCardToDeck_addsCard_true() {
    Card card = new Card(Suit.spade, Rank.ace);
    deck.addCardToDeck(card);
    assertEquals(deck.count(), fullDeckSize + 1);
  }

  @Test
  public final void testGiveCardFromDeck_givesCard_true() {
    deck.giveCardFromDeck();
    assertEquals(deck.count(), fullDeckSize - 1);
  }

  @Test
  public final void testGiveNCardsFromDeck_givesNCards_true() {
    deck.giveNCardsFromDeck(7);
    assertEquals(deck.count(), fullDeckSize - 7);
  }
  
  @Test(expected = IndexOutOfBoundsException.class)
  public final void testGiveNCardsFromDeck_givesTooMuchCards() {
    deck.giveNCardsFromDeck(fullDeckSize + 1);
  }

}
