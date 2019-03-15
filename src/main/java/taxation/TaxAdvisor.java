package taxation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaxAdvisor {
  public static void calculateArrayTaxes(Taxable[] ta) {
    for (Taxable t : ta) {
      calculateTaxes(t);
    }
//    ta[0] = new Corporation();
  }
  public static void calculateTaxes(Taxable t) {}

  // assignment compatibility of argument type (List<? extends Taxable>)
  // varies in same direction as the assignment compatibility of
  // ? itself
  // Co-variance
  public static void calculateBulkTaxes(List<? extends Taxable> lt) {
    for (Taxable t : lt) {
      calculateTaxes(t);
    }
//    lt.add(new Taxable());
  }

  // Contra-variance
  public static void joesCollectClients(List<? super Individual> li) {
//    Individual iOne = li.get(0);
    li.add(new Individual());
  }

  public static void main(String[] args) {
    List<Taxable> customers = new ArrayList<>(Arrays.asList(
        new Individual(),
        new Corporation(),
        new Corporation(),
        new Individual(),
        new Individual()
    ));
    calculateBulkTaxes(customers);

    Individual[] ia = {
        new Individual()
    };

    List<Individual> joesClients = Arrays.asList(
        new Individual(),
        new Individual()
    );

    System.out.println("type of list<Individual> is "
        + joesClients.getClass().getName());
    System.out.println("type of Individual[] is "
        + ia.getClass().getName());
    calculateArrayTaxes(ia);
    calculateBulkTaxes(joesClients);

    joesCollectClients(joesClients);
    joesCollectClients(customers);

  }
}
