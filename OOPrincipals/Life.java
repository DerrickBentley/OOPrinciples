
/**
 * Write a description of class Life here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Life
{

    public Person[] people;
    
    public Life()
    {
        people = new Person[2];
        people[0] = new Person("Luke");
        people[1] = new Person("Derrick");
    }
    
    public Life(Person[] population){
        this.people = population;
    }
    
    public void soundOff(){
        for(int i = 0; i < people.length; i++){
            System.out.println(people[i].toString());
        }
    }
}
