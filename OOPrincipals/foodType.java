
/**
 * Enumeration class foodType - food is either soupy, mushy, or solid
 *
 * @author Derrick Bentley
 * @version 1.0
 */
public enum foodType
{
    SOUPY(5), MUSHY(10), SOLID(15);
    
    private int messy;
    
    foodType(int messy){
        this.messy = messy;
    }
    
    public int messiness(){
        return messy;
    }
}
