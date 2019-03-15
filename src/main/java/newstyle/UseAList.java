package newstyle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseAList {
  public static void showAll(List<String> l) {
    for (String s : l) {
      System.out.println("> " + s);
    }
    System.out.println("-------------");
  }

  public static void addItems(List/*<LocalDate> */l) {
    l.add(LocalDate.now());
  }

  public static void main(String[] args) {
//    List<String> l = new ArrayList<>();
    List<String> l = Collections.checkedList(new ArrayList<>(), String.class);
//    List<String> l = Collections.checkedList(new ArrayList<>(), "".getClass());
    l.add("Fred");
    l.add("Jim");
    l.add("Sheila");
    addItems(l);
//    l.add("Alan");
    System.out.println(l);

    showAll(l);

//    String s = (String)l.get(3);
    String s = l.get(3);
  }
}
