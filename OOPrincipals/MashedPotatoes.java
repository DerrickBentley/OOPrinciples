
/**
 * Mashed Potatoes are a mushy food.
 *
 * @author Derrick Bentley
 * @version 03/09/2017
 */
public class MashedPotatoes extends Food
{

    public MashedPotatoes()
    {
        super(150, foodType.MUSHY);
    }
    
    public MashedPotatoes(int quantity){
        super(quantity, foodType.MUSHY);
    }
    
    public String toString(){
        return "Im Mashed Potatoes with quantity " + quantity;
    }
}
