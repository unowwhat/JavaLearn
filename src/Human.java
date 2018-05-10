/**
 * Created by Roman on 22.04.2018.
 */
public class Human {
    String firstName;
    String lastName;
    private int age;

    Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        age = (int) (100 * Math.random());
    }

    public int getAge(){
        return this.age;
    }
}
