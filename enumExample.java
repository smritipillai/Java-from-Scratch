class Kitty{
  enum KittyColor{
    Blue, Red, Brown // restrict colors to only these 3.
  }
  KittyColor colours;
}
public class enumExample{
  public static void main(String[] args) {
    Kitty k = new Kitty();
    k.colours = Kitty.KittyColor.Brown;
    System.out.println("color is: " + k.colours);
  }
}
