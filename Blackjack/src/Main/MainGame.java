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
import java.util.Scanner;

/**
 * A game of blackjack I made using an arraylist to practice creating
 * new classes and using an arraylist.
 * 
 * FULL DISCLOSURE: 
 * 	This was created with the help of an online youtube 
 * 	tutorial from TechLiterate.
 * 
 * @author JGambill w/ TechLiterate
 */

public class MainGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Deck theDeck = new Deck(1, true);
				
				
		// create players
		Player me;
		Player dealer = new Player ("House");
		
		
		
		// welcome player
		System.out.println("Welcome to BlackJack by Judge!\n");
		System.out.println("What is your name?: ");
		String name = sc.next();
		me = new Player(name);
		
		// deal cards
		me.addCardToHand(theDeck.dealTopCard());
		dealer.addCardToHand(theDeck.dealTopCard());
		me.addCardToHand(theDeck.dealTopCard());
		dealer.addCardToHand(theDeck.dealTopCard());
		
		System.out.println("The cards are on the table\n\n----------\n");
		
		// reveal cards to player
		System.out.println(me.getName() + "'s Hand:");
		me.showHand(true);
		System.out.println("\n----\n");
		System.out.println("House's Hand:");
		dealer.showHand(false);
		
		// game loop
		boolean dealerDone = false;
		boolean meDone = false;
		String ans;
		
		while (!meDone || !dealerDone) {
			
			if (!meDone) {
				
				System.out.println("Hit or Stay (H/S)? ");
				ans = sc.next();
				
				if (ans.equalsIgnoreCase("h")) {
					System.out.println(me.getName() + " hits!");
					meDone = !me.addCardToHand(theDeck.dealTopCard());
					me.showHand(true);
					System.out.println();
				} else {
					meDone = true;
				}
				
			}
			
			if (!dealerDone) {
				if (dealer.getHandSum() < 17) {
					System.out.println("The dealer hits!");
					dealerDone = !dealer.addCardToHand(theDeck.dealTopCard());
					dealer.showHand(false);
				} else {
					dealerDone = true;
				}
			}
		}
		
		sc.close();
		
		System.out.println("\n----\n" + me.getName() + "'s final hand:");
		me.showHand(true);
		System.out.println("\nDealer's final hand:");
		dealer.showHand(true);
		
		int myHandSum = me.getHandSum();
		int dealerHandSum = dealer.getHandSum();
		
		if (myHandSum > dealerHandSum && myHandSum <=21) {
			System.out.println("You WIN!!");
			System.exit(0);
		} else if (myHandSum == dealerHandSum) {
			System.out.println("Tied!");
			//TODO: write push program
		} else {
			System.out.println("House wins! :(");	
			
		}
		
		
	}
}
