
/**
 * Cereal is a soupy food.
 *
 * @author Derrick Bentley
 * @version 03/09/2017
 */
public class Cereal extends Food
{

    public Cereal()
    {
        super();
        this.type = foodType.SOUPY;
    }
    
    public Cereal(int quantity){
        super();
        this.quantity = quantity;
        this.type = foodType.SOUPY;
    }
    
    public String toString(){
        return "I'm cereal with quantity " + quantity;
    }
}
