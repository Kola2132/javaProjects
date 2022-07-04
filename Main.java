import java.security.PermissionCollection;

public class Main {
  public static void main(String[] args) {
    Person myPerson = new Person("Krzysiek","Krowka");
    System.out.println(myPerson.sayHello());
    System.out.println(myPerson.allInformation());
 }
}