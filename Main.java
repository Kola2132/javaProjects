import java.security.PermissionCollection;

public class Main {
  public static void main(String[] args) {
    Person myPerson = new Person();
    myPerson.age="16";
    myPerson.height="192";
    myPerson.weight="83";
    myPerson.name="Krzysiek";
    myPerson.surname="Krowka";
    System.out.println(myPerson.sayHello());
    System.out.println(myPerson.allInformation());
 }
}