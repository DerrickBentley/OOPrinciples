
/**
 * Basic Spoon class, is a scoopy utensil
 *
 * @author Derrick Bentley
 * @version 1.0
 */
public class Spoon extends Utensil
{

    public Spoon()
    {
        super(5, 100, utensilType.SCOOP);
    }
    
    public Spoon(int usefulness, int cleanliness){
        super(usefulness, cleanliness, utensilType.SCOOP);
    }

    public String toString(){
        return "Spoon";
    }
}
