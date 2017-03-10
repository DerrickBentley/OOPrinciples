
/**
 * Kitchens have utensils and food
 *
 * @author Derrick Bentley
 * @version 03/09/2017
 */
public class Kitchen
{
    public Utensil[] drawer;
    public Food[] fridge;

    /**
     * Constructor for objects of class Kitchen
     */
    public Kitchen()
    {
        this.drawer = new Utensil[2];
        drawer[0] = new Spoon();
        drawer[1] = new Fork();
        this.fridge = new Food[3];
        fridge[0] = new Cereal();
        fridge[1] = new MashedPotatoes();
        fridge[2] = new MacNCheese();
    }
    
    public Kitchen(Utensil[] drawer, Food[] fridge){
        this.drawer = drawer;
        this.fridge = fridge;
    }
    
}
