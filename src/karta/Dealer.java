package karta;

import java.util.List;

public class Dealer {
  private Deck deck;
  public Player[] players;
  private final int numberOfPlayers;
  
  Dealer(final int numberOfPlayers, Deck deck) {
    this.numberOfPlayers = numberOfPlayers;
    this.deck = deck;
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
