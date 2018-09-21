import java.io.*;
public class Employee{
  String name;
  int age;
  String desig;
  double salary;
   public Employee(){

   }
  public void name(String n){
    name = n;
  }
  public void age(int a){
    age = a;
  }
  public void desig(String d){
    desig = d;
  }
  public void salary(int s){
    salary = s;
  }
    public void print(){
    System.out.println("Name is: " + this.name);
    System.out.println("Age is: " + this.age);
    System.out.println("Designation is: " + this.desig);
    System.out.println("Salary is: "+ this.salary);
  }
  public static void main(String[] args) {
    Employee e1 =  new Employee();
    Employee e2 = new Employee();
    e1.name("Rob Taylor");
    e1.age(29);
    e1.desig("Software Engineer");
    e1.salary(50000);
    e1.print();
    e2.name("Anna Williams");
    e2.age(32);
    e2.desig("Software Engineer senior");
    e2.salary(200000);
    e2.print();
  }
}
