package Main;

/**
 *
 * @author Thumbone1
 */
public class Wallet {
    private int amount;
    
    /**
     * Constructor
     * @param amount = starting amount 
     */
    public Wallet(int amount) {
        this.amount = amount;
    }
    
    /**
     * Constructor with initial amount == 100
     */
    public Wallet() {
        this(100);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public void increaseAmount(int amount) {
        this.amount += amount;
    }
    
    public void decreaseAmount(int amount) {
        this.amount -= amount;
    }
     

}
