/**
 * Created by Roman on 22.04.2018.
 */
public class Company {
    public Human[] staff;
    String cname;

    Company(String name){
        cname = name;
        staff = new Human[10];
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
