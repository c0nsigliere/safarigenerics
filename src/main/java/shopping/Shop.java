package shopping;

public class Shop {
  public static <E extends Sized & Colored> boolean match(E left, E right) {
    return left.getSize() == right.getSize()
        && left.getColor().equals(right.getColor());
  }
  public static void main(String[] args) {
    ClothingPair<Shoe> ps = new ClothingPair<>(
        new Shoe(9, "Brown"), new Shoe(8, "Brown"));
    ClothingPair<Shoe> ps2 = new ClothingPair<>(
        new Shoe(8, "Brown"), new Shoe(8, "Black"));
    ClothingPair<Shoe> ps3 = new ClothingPair<>(
        new Shoe(8, "Brown"), new Shoe(8, "Brown"));

    System.out.println("ps is matched? " + ps.isMatched());
    System.out.println("ps2 is matched? " + ps2.isMatched());
    System.out.println("ps3 is matched? " + ps3.isMatched());

    Shirt s = new Shirt("Red");
    Shirt s2 = new Shirt("Brown");

    System.out.println("s matches ps? " + ps.matchItem(s));
    System.out.println("s2 matches ps? " + ps.matchItem(s2));

    System.out.println("proposal matches? " +
        match(new Shoe(8, "Brown"), new Shoe(8, "Brown")));
  }
}
