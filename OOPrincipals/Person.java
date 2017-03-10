
/**
 * People use tools and eat things
 *
 * @author Derrick Bentley
 * @version 03/09/2017
 */
public class Person
{
    public String name;
    private int standards;
    public int fullness;
    public Kitchen kitchen;

    public Person()
    {
        this.name = "Nameless";
        this.fullness = 1000;
        this.standards = 0;
        this.kitchen = new Kitchen();
    }
    
    public Person(String name){
        this.name= name;
        this.fullness = 1000;
        this.standards = 0;
        this.kitchen = new Kitchen();
        
    }
    
    public Person(String name, int fullness, int standards){
        this.name = name;
        this.fullness = fullness;
        this.standards = standards;
        this.kitchen = new Kitchen();
    }
    
    public String toString(){
        return "Hello, my name is " + name + ", I am " 
            + fullness + " full, and have " + standards + " standards";
    }
}
