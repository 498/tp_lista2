package karta;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class PlayerTest {

  private Player player;
  
  @Before
  public final void setUp() {
    player = new Player();
  }
  
  @Test
  public final void testPlayer_playerExists_true() {
    assertNotNull(player);
  }

  @Test
  public final void testGetCards_getsCards_true() {
    List<Card> cards = new LinkedList<Card>();
    cards.add(new Card(Suit.spade, Rank.ace));
    
    player.getCards(cards);
    
    assertEquals(player.countCards(), 1);
  }

}
