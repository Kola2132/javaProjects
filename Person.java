public class Person{
    String age,height,weight,name,surname;
    public String allInformation(){
        return "Name: "+name+"\nSurname: "+surname+"\nAge: "+age+"\nWeight: "+weight+"\nHeight: "+height;     
    }
    public String sayHello()
    {
      return "Hello "+name+" "+surname;
    }
  }
