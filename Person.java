public class Person{
    String name,surname;
    int age,height,weight;
    Person(String tempName,String tempSurname){
      name=tempName;
      surname=tempSurname;
    }
    public void setData(int age,int height, int weight)
    {
      this.age=age;
      this.height=height;
      this.weight=weight;
    }
    public String allInformation(){
        return "Name: "+name+"\nSurname: "+surname+"\nAge: "+age+"\nWeight: "+weight+"\nHeight: "+height;     
    }
    public String sayHello()
    {
      return "Hello "+name+" "+surname;
    }
    public void height(){
      for(int i=0;i<this.height;i++)
      System.out.print("|");
    }
    public void canDrinkAlcohol()
    {
      if (this.age>=18)
      System.out.println(this.name+" moze pic");
      else
      System.out.println(this.name+" moze pic ale nielegalnie :D");
    }
  }
