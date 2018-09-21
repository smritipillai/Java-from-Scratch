class OuterClass{
  int xyz;
  private class inner{
    void print(){
      System.out.println("This is an inner-class statement");
    }
  }
  void display(){
    inner i = new inner();
    i.print();
  }
}
public class innerClass{
  public static void main(String[] args) {
    OuterClass o = new OuterClass();
    o.display();
  }
}
