package shopping;

//public class ClothingPair<E extends Sized, String> extends Pair<E> {
//  private String name = "Fred";

// class constraint if used, must come first.
public class ClothingPair<E extends /*Object & */Sized & Colored>
    extends Pair<E> {

  public ClothingPair(E left, E right) {
    super(left, right);
  }

  public <F extends Colored> boolean matchItem(F item) {
    return left.getColor().equals(item.getColor());
  }

  public boolean isMatched() {
    return left.getSize() == right.getSize()
        && left.getColor().equals(right.getColor());
  }


}
