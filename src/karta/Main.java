package karta;

public class Main {

  public static void main(String[] args) {
    Deck deck = new Deck();
    Dealer dealer = new Dealer(4, deck);
    deck.shuffle();
    dealer.deal(12);
    for (int i=0; i < 4; ++i) {
      System.out.println("gracz " + i + " ma " + dealer.players[i].countCards() + " kart");
    }
    System.out.println("w talii zostało " + deck.count() + " kart");
  }

}
