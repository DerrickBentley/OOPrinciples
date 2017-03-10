
/**
 * Basic fork class, is a stabby utensil
 *
 * @author Derrick Bentley
 * @version 03/09/2017
 */
public class Fork extends Utensil
{

    /**
     * Constructor for objects of class fork
     */
    public Fork()
    {
        super(5, 100, utensilType.STAB);
    }
    
    public Fork(int usefulness, int cleanliness){
        super(usefulness, cleanliness, utensilType.STAB);
    }
    
    public String toString(){
        return "Fork";
    }
}
