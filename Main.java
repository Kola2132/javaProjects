import java.security.PermissionCollection;

public class Main {
  public static void main(String[] args) {
    Person myPerson = new Person("Krzysiek","Krowka");
    myPerson.setData(16, 192,83);
    System.out.println(myPerson.sayHello());
    System.out.println(myPerson.allInformation());
    myPerson.canDrinkAlcohol();
 }
}