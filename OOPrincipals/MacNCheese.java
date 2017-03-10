
/**
 * Mac N Cheese is a solid food.
 *
 * @author Derrick Bentley
 * @version 03/09/2017
 */
public class MacNCheese extends Food
{

    public MacNCheese()
    {
        super();
        this.type = foodType.SOLID;
    }
    
    public MacNCheese(int quantity){
        super(quantity, foodType.SOLID);
    }
    
    public String toString(){
        return "Mac and Cheese";
    }
}
