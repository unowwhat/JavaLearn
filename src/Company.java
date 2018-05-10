/**
 * Created by Roman on 22.04.2018.
 */
public class Company {
    String cname;
    public Human[] staff;

    Company(String name){
        cname = name;
        staff = new Human[10];
    }
}
