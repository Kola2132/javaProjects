public class Person{
    String name,surname;
    int age,height,weight;
    Person(String tempName,String tempSurname){
      name=tempName;
      surname=tempSurname;
    }
    public String allInformation(){
        return "Name: "+name+"\nSurname: "+surname+"\nAge: "+age+"\nWeight: "+weight+"\nHeight: "+height;     
    }
    public String sayHello()
    {
      return "Hello "+name+" "+surname;
    }
  }
