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
public class Card {
	
	/**
	 * One of four suits: Diamonds, Hearts, Clubs, Spades
	 */
	private Suit mySuit;
	
	/**
	 * Number associated with card where Jack-King = 11-13 and Ace = 1
	 */
	private int myNumber;
	
	/**
	 * Card constructor
	 * 
	 * @param aSuit		suit associated with card
	 * @param aNumber	number associated with card
	 */
	public Card(Suit aSuit, int aNumber) {
		this.mySuit = aSuit;
		this.myNumber = aNumber;
	}
	
	/**
	 * Prints card number and suit in string format
	 * throws IllegalStateException if number not listed here
	 */
	public String toString() {
		final String myNum;
		
		switch(this.myNumber) {
			
		case 1: 
			myNum = "Ace";
			break;
			
		case 2: 
			myNum = "Two";
			break;
			
		case 3:
			myNum = "Three";
			break;
			
		case 4: 
			myNum = "Four";
			break;
			
		case 5:
			myNum = "Five";
			break;
			
		case 6:
			myNum = "Six";
			break;
			
		case 7:
			myNum = "Seven";
			break;
			
		case 8:
			myNum = "Eight";
			break;
			
		case 9:
			myNum = "Nine";
			break;
			
		case 10:
			myNum = "Ten";
			break;
			
		case 11:
			myNum = "Jack";
			break;
			
		case 12:
			myNum = "Queen";
			break;
			
		case 13:
			myNum = "King";
			break;
			
		default:
			throw new IllegalStateException("Not expecting card number");
		
		}
		
		return myNum + " of " + mySuit.toString();	
			
	}
	
	/**
	 * Return card number for scoring
	 * @return	card number
	 */
	public int getNumber() {
		return this.myNumber;
	}

}
