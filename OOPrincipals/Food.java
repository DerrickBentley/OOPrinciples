
/**
 * Write a description of class food here.
 *
 * @author Derrick Bentley
 * @version 03/09/2017
 */
public class Food
{
    // instance variables - replace the example below with your own
    public int quantity;
    public foodType type;

    /**
     * Constructor for objects of class food
     */
    public Food()
    {
        this.quantity = 100;
        this.type = foodType.MUSHY;
    }
    
    public Food(int quantity, foodType type){
        this.quantity = quantity;
        this.type = type;
    }
    
    public String toString(){
        return "I'm food with quantity " + quantity;
    }
}
