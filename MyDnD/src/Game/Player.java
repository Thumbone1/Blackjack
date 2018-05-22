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
public class Player {
    
    private String name;
    private int level;
    private int movementSpeed;
    private int initiave;
    private int armorClass;
    private int health;
    private int experience;

    public Player(String name, int level) {
        this.name = name;
        this.level = level;
    }
    
    /**
     * 
     * @param name = player name
     * starts a player at level 1
     */
    public Player(String name) {
        this(name, 1);
    }
    
    /**
     * constructor for NPC chars subclass only!
     */
    public Player() {
        this.name = "";
        this.level = 1;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public int getInitiave() {
        return initiave;
    }

    public String getName() {
        return name;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public int getExperience() {
        return experience;
    }    
    
    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setInitiave(int initiave) {
        this.initiave = initiave;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    
    
    
}
