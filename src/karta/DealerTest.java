package karta;

import static org.junit.Assert.*;

import org.junit.Test;

public class DealerTest {

  @Test
  public final void testDealInt_dealsCards_true() {
    final Dealer dealer = new Dealer(4, new Deck());
    dealer.deal(4);
    for (int i = 0; i < 4; ++i) {
      assertEquals(dealer.players[i].countCards(), 4);
    }
  }
  
  @Test(expected = IndexOutOfBoundsException.class)
  public final void testDealInt_dealTooMuch_exception() {
    final Dealer dealer = new Dealer(4, new Deck());
    dealer.deal(14);
  }

  @Test
  public final void testDeal_dealUnevenNumberOfPlayers_cardsLeft() {
    Deck deck = new Deck();
    final Dealer dealer = new Dealer(5, deck);
    dealer.deal();
    assertEquals(deck.count(), 2);
  }

}
