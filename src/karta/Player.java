package karta;

import java.util.List;

public class Player {
  private List<Card> cards;
  
  Player() {
    // empty
  }
  
  void getCards(List<Card> cards) {
    this.cards = cards;
  }
  
  int countCards() {
    return cards.size();
  }
}
