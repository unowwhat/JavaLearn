/**
 * Created by Roman on 22.04.2018.
 */
public class Main {
    public static void main(String[] args) {
        Human petya = new Human("Петя", "Иванов");
        Human vasya = new Human("Вася", "Петров");
        //System.out.println(petya.getAge());
        Company comp = new Company("Рога и копыта");
        comp.staff[0] = petya;
        comp.staff[1] = vasya;
        for (int i = 0; i < 2; i++) {
            System.out.println(comp.staff[i].firstName + " "+ comp.staff[i].lastName + " " + comp.staff[i].getAge());
        }
    }
}
