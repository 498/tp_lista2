package karta;

import static org.junit.Assert.*;

import org.junit.Test;

public class DealerTest {
  
  @Test
  public final void testDealer() {
    Dealer dealer = new Dealer(4);
  }

  @Test
  public final void testDealInt_dealsCards_true() {
    final Dealer dealer = new Dealer(4);
    dealer.deal(4);
    for (int i = 0; i < 4; ++i) {
      assertEquals(dealer.players[i].countCards(), 4);
    }
  }
  
  @Test(expected = IndexOutOfBoundsException.class)
  public final void testDealInt_dealTooMuch_exception() {
    final Dealer dealer = new Dealer(4);
    dealer.deal(14);
  }

  @Test
  public final void testDeal_dealUnevenNumberOfPlayers_cardsLeft() {
    final Dealer dealer = new Dealer(5);
    dealer.deal();
    assertEquals(dealer.deck.count(), 2);
  }

}
