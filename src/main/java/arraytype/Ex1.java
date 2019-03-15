package arraytype;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Ex1 {
  public static <E> E[] asArray(List<E> in, Class<E> cl) {
    E[] results = (E[])Array.newInstance(cl, in.size());

    for (int i = 0; i < in.size(); i++) {
      results[i] = in.get(i);
    }
    return results;
  }
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Fred", "Jim", "Shiela");

    String[] na = asArray(names, String.class);

    System.out.println(names);
    for(String s : na) {
      System.out.println("> " + s);
    }

  }
}
