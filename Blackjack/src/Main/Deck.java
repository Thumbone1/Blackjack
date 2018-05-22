/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

/**
 *
 * @author Thumbone1
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	/**
	 * The number of cards in the deck
	 */
	private int numCards;
	
	/**
	 * Init of an ArrayList for the deck holding card objects
	 */
	private List<Card> myDeck;
	
	/**
	 * Overloaded constructor with one deck, unshuffled
	 */
	public Deck() {
		this(1, false);
	}
	
	/**
	 * Constructor deck class using an ArrayList
	 * 
	 * @param numDecks	number of decks
	 * @param shuffle	whether deck/s are shuffled
	 */
	public Deck(int numDecks, boolean shuffle) {
		this.numCards = numDecks * 52;
		this.myDeck = new ArrayList<Card>();
		
		// add numCards cards to the myDeck
		for (int d = 0; d < numDecks; d++) {
			for (final Suit suit : Suit.values()) {
				for (int n = 1; n <= 13; n++) {
					myDeck.add(new Card(suit, n));
				}
			}
		}
		
		// shuffle deck 2 times (I guess this is how it's done in vegas)
		if (shuffle) {
			Collections.shuffle(myDeck);
			Collections.shuffle(myDeck);
		}
		
	}
	
	/**
	 * Deal card from the top of the deck and remove
	 * same card
	 * 
	 * @return	first card in the deck
	 */
	public Card dealTopCard() {
		return myDeck.remove(0);
	}
	
	/**
	 * Getter for the Deck
	 * 
	 * @return	Arraylist of cards representing 1+ card decks
	 */
	public ArrayList<Card> getDeck() {
		return (ArrayList<Card>) myDeck;
	}
	
	/**
	 * Getter for number of cards in deck
	 * 
	 * @return	numCards
	 */
	public int getNumCards() {
		return numCards;
	}

}
