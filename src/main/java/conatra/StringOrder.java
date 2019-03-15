package conatra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class ReverseTextSort implements Comparator<CharSequence> {
  @Override
  public int compare(CharSequence o1, CharSequence o2) {
    return o2.toString().compareTo(o1.toString());
  }
}
public class StringOrder {
  public static void main(String[] args) {
    List<String> ls = new ArrayList<>(Arrays.asList("Fred", "Jim", "Sheila"));

    List<StringBuilder> lb = new ArrayList<>(Arrays.asList(
        new StringBuilder("Fred"),
        new StringBuilder("Jim"),
        new StringBuilder("Sheila")));
    // function arguments are naturally "contra-variant"
    // function return values need to be "co-variant"
    ls.sort(new ReverseTextSort());
    System.out.println(ls);
    lb.sort(new ReverseTextSort());
  }
}
