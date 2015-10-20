package karta;

import java.util.List;

public class Dealer {
  public final Deck deck;
  public Player[] players;
  private final int numberOfPlayers;
  
  Dealer(final int numberOfPlayers) {
    this.numberOfPlayers = numberOfPlayers;
    deck = new Deck();
    players = new Player[numberOfPlayers];
    for (int i = 0; i < numberOfPlayers; ++i) {
      players[i] = new Player();
    }
  }
  
  public void deal(final int numCardsForPlayer) {
    List<Card> cards;
    for (int i = 0; i < numberOfPlayers; ++i) {
      cards = deck.giveNCardsFromDeck(numCardsForPlayer);
      players[i].getCards(cards);
    }
  }
  
  public void deal() {
    deal(deck.count() / numberOfPlayers);
  }

}
