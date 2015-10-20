package karta;

public class Card implements Comparable<Card> {
  private final Suit suit;
  private final Rank rank;

  public Card(final Suit suit, final Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public Suit getSuit() {
    return this.suit;
  }

  public Rank getRank() {
    return this.rank;
  }

  @Override
  public int compareTo(Card card) {
    // TODO NOT IMPLEMENTED YET
    return 0;
  }

}
