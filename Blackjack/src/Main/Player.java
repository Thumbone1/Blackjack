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
import java.util.List;
import java.util.ArrayList;

public class Player {
	
	private List<Card> hand = new ArrayList<Card>();
	private String name;
	
	/**
	 * Player constructor takes a name
	 * @param aName	Player's name
	 */
	public Player(String aName) {
		this.name = aName;
		this.emptyHand();
	}
	
	/**
	 * Adds a card to the players hand and checks if player is busted
	 * 
	 * @return	true if player can hit
	 */
	public boolean addCardToHand(Card card) {
		this.hand.add(card);
		return (this.getHandSum() < 21);
	}
	
	/**
	 * gets the sum of the hand 
	 * @return	handSum
	 */
	public int getHandSum() {
		
		int numAces = 0;
		int handSum = 0;
		
		for (Card card : hand) {
			int cardNum = card.getNumber();
			
			// if the card is an ace then add 11 and increment numAces
			if (cardNum == 1) {
				numAces++;
				handSum+=11;
			// if the card is jack or above add 10
			} else if (cardNum >10) {
				handSum += 10;
			// else just add the card number to the handSum
			} else {
				handSum += cardNum;
			}
		}
		
		// Handle aces
		while (handSum > 21 && numAces > 0) {
			handSum -= 10;
			numAces--;
		}
		return handSum;
	}
	
	public void showHand(boolean showFirstCard) {

		for (Card c : hand) {
			if (hand.indexOf(c)==0 && !showFirstCard) {
				System.out.println("   (hidden)    ");  
			} else {
				System.out.println(c.toString());
			}
		}
		
	}
	
	/**
	 * Empty the hand of the player
	 */
	private void emptyHand() {
		hand.clear();
	}
	
	/**
	 * getter for the hand arraylist
	 * @return	player hand in arraylist format
	 */
	public List<Card> getHand() {
		return hand;
	}
	
	/**
	 * getter for the player name
	 * @return	name
	 */
	public String getName() {
		return name;
	}

}
