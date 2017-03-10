
/**
 * Class utensil - Utensils perform two primary uses. 
 * Decrementing food until dirty, and being cleaned.
 *
 * @author Derrick Bentley
 * @version 1.0
 */
public class Utensil
{
    public int cleanliness;
    public int usefulness;
    public utensilType type; 
    
    private int originalCleanliness;


    /**
     * Constructor for objects of class utensil
     */
    public Utensil()
    {
        cleanliness = 100;
        originalCleanliness = 100;
        usefulness = 10;
        type = utensilType.STAB;
    }
    
    /**
     * constructor to set properties
     */
    public Utensil(int usefulness, int cleanliness, utensilType type){
        this.usefulness = usefulness;
        this.cleanliness = cleanliness;
        this.originalCleanliness = cleanliness;
        this.type = type;
    }
    
    public int useOnFood(Food food){
        System.out.println(this.toString());
        this.cleanliness -= food.type.messiness();
        return food.quantity -= this.usefulness;
    }
    
    public void clean(){
        this.cleanliness = this.originalCleanliness;
    }
   
    public String toString(){
        return "im a utensil with " + cleanliness + " cleanliness";
    }

}
