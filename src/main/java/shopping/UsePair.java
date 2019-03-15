package shopping;

import java.time.LocalDate;

public class UsePair {
  public static void main(String[] args) {
//    Pair<String> p = new Pair("Fred", LocalDate.now());
//    Pair<String> p = new Pair<String>("Fred", LocalDate.now());
//    Pair<String> p = new Pair<>("Fred", LocalDate.now());
    Pair<String> p = new Pair<>("Fred", "Jones");

    String s = p.getLeft();
  }
}
