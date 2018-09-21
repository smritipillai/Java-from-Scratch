public class Constructor{
  String name;
  int age;
  public Constructor(String name){
    System.out.println("My name is : " + name);
  }
  public void setAge(int age){
    this.age = age;
  }
  public int getAge(){
    System.out.println("My age is: " + age);
    return age;
  }
  public static void main(String[] args) {
    Constructor c = new Constructor("Smishi");
    c.getAge();
    c.setAge(19);
  }
}
