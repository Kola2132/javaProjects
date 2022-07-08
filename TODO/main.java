import java.security.IdentityScope;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        String tasks="";
        int ID=1;
        task[] list;
        list = new task[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Type 'TODO' to show list of Commands");
        while(tasks!="EXIT")
        {
            tasks=sc.nextLine();
            if(tasks.startsWith("TODO") || tasks.startsWith("EXIT")){
            if(tasks=="TODO"){
            System.out.println("TODO\n~ TODO ADD - create new task\n~ TODO LIST - show my tasks\n~ TODO MARK id STATUS - change status (NEW, ACTIVE, DONE)\n~ TODO EDIT id 'new name' - change name of existing task\n~ TODO DELETE id - remove task from list\n~ EXIT - End program");
            }
            if(tasks.startsWith("TODO ADD ")){
                list[ID]=new task(ID,tasks.substring(9));
                System.out.println("Task"+tasks.substring(9)+" added successfully");
                ID++;
            }
            if(tasks=="TODO LIST"){
                for(int i=1;i<ID;i++)
                System.out.println("\n~ "+list[i].ID+". "+list[i].name+" "+list[i].status);
            }
            if(tasks.startsWith("TODO MARK ")){
                String[] temp=tasks.split(" ");
                list[Integer.parseInt(temp[2])].status=temp[3];
            }
            if(tasks.startsWith("TODO EDIT ")){
                String[] temp=tasks.split(" ",4);
                list[Integer.parseInt(temp[2])].name=temp[3];
            }
            if(tasks.startsWith("TODO DELETE ")){
                String[] temp=tasks.split(" ");
                if(ID>2){
                ID=ID-1;  
                String pom1=list[ID-1].name;
                String pom2=list[ID-1].status;
                list[ID-1].name=list[ID].name;
                list[ID-1].status=list[ID].status;
                for(int i=ID-1;i>Integer.parseInt(temp[2]);i--){
                    String pom3=pom1;
                    String pom4=pom2;
                    pom1=list[i-1].name;
                    pom2=list[i-1].status;
                    list[i-1].name=pom3;
                    list[i-1].status=pom4;;         
                }
                list[ID].name="";
                list[ID].status="";
                }
            }      
        }
            else{
                System.out.println("Wrong text typed");
            }
        }  
        sc.close();
    }
}
