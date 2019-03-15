package oldstyle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UseAList {
  public static void showAll(List l) {
    for (Object o : l) {
      System.out.println("> " + o);
    }
    System.out.println("-------------");
  }
  public static void addItems(List l) {
    l.add(LocalDate.now());
  }
  public static void main(String[] args) {
    List l = new ArrayList();
    l.add("Fred");
    l.add("Jim");
    l.add("Sheila");
    addItems(l);
    System.out.println(l);

    showAll(l);

    String s = (String)l.get(3);

  }
}
