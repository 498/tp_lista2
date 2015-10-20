package karta;

import java.util.Collections;
import java.util.Random;
import java.util.LinkedList;

public class Deck {
	private LinkedList<Card> cards;

	Deck() {
		cards = new LinkedList<Card>();
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				cards.add(new Card(s, r));
			}
			shuffle();
		}
	}

	private void shuffle() {
		Collections.shuffle(cards, new Random(System.nanoTime()));
	}

	public void addCardToDeck(Card c) {
		cards.add(c);
	}

	public Card giveCardFromDeck() {
		Card c = cards.getFirst();
		cards.remove(0);
		return c;
	}
	
	public LinkedList<Card> giveNCardsFromDeck(int n) {
		LinkedList<Card> cards = new LinkedList<Card>();
		for (int i = 0; i < n; ++i) {
			cards.add(this.giveCardFromDeck());
		}
		return cards;
	}
}
