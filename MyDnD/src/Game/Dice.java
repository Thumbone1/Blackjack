/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.*;

/**
 *
 * @author judgeandsiri
 */
public class Dice {
    
    private final int D4 = 4;
    private final int D6 = 6;
    private final int D8 = 8;
    private final int D10 = 10;
    private final int D20 = 20;
    
    private int dType;
    private int numDice;
    
    public Dice(int type, int numDice) {
        if(type == 4) this.dType = D4;
        if(type == 6) this.dType = D6;
        if(type == 8) this.dType = D8;
        if(type == 10) this.dType = D10;
        if(type == 20) this.dType = D20;
        
        this.numDice = numDice;
    }
    
    /**
     * 
     * @param type = D4, D6, D8, D10, D20 
     * Create one of the specified die type
     */
    public Dice(int type) {
        this(type, 1);
    }
    
    /**
     * 
     * @return total from dice roll based on dice type and number
     */
    public int rollDice() {
        int total = 0;        
        int type = getdType();
        int num = getNumDice();
        Random r = new Random();
               
        for (int i = 0; i < num; i++) {
            total += r.nextInt(type) + 1;
        }        
        return total;
    }

    private int getdType() {
        return dType;
    }

    private int getNumDice() {
        return numDice;
    }
    
    
    
}
