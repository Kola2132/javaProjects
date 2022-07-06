import java.util.Scanner; 
import java.security.PermissionCollection;

public class addMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int pom=0;
        int i=0;
        String[] persons;
        persons = new String[100];
          while(i!=3){
            System.out.println("Witaj, co chcesz zrobic, wpisz:\n1 - dodaj osobe;\n2 - wyswietl wszystkich;\n3 - zakoncz;");
            i=sc.nextInt();
            if(i==1){
                System.out.println("Podaj imie i nazwisko: ");
                sc.nextLine();
                persons[pom]=sc.nextLine();
                pom++;
            }
            if(i==2){
                for(int j=0;j<pom;j++){
                    System.out.println(persons[j]);
                }
            }
          }
          sc.close();
      }
  }