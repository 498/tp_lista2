package karta;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CardTest {
  Card card;
  
  @Before
  public final void setUp() {
    card = new Card(Suit.spade, Rank.ace);
  }
  
  @Test
  public final void testCard() {
    assertNotNull(card); 
  }

  @Test
  public final void testGetSuit() {
    assertEquals(card.getSuit(), Suit.spade);
  }

  @Test
  public final void testGetRank() {
    assertEquals(card.getRank(), Rank.ace);
  }

  @Ignore
  @Test
  public final void testCompareTo() {
    fail("Not yet implemented"); // TODO
  }

  @Ignore
  @Test
  public final void testEqualsObject() {
    fail("Not yet implemented"); // TODO
  }

}
