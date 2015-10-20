package karta;

public class Card implements Comparable<Card> {
	private Suit suit;
	private Rank rank;

	public Card(Suit suit, Rank rank) {
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
	public int compareTo(Card c) {
		// NOT IMPLEMENTED YET
		//RankComparator comp = new RankComparator();
		//return comp.compare(this.getRank(), c.getRank());
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Card))
			return false;
		Card c = (Card) obj;
		if (this.getRank().compareTo((c.getRank())) == 0) {
			return true;
		} else
			return false;

	}

}
