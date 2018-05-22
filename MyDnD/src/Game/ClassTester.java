/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 *
 * @author judgeandsiri
 */
public class ClassTester {
    public static void main(String[] args) {
        Dice d = new Dice(6, 2);
        for(int i = 0; i < 200; i++) System.out.println(d.rollDice());
    }
}
