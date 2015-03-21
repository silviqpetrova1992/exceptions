package string;

import java.util.Scanner;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/21/15.
 */
public class StringSum {
  static public String sum(String a, String b) {
    String sum;
    try {
      sum = String.valueOf(Double.parseDouble(a) + Double.parseDouble(b));
    } catch (NumberFormatException e) {
      sum = "You didn't enter only numbers! You entered " + e.getMessage();
    }
    return sum;
  }

  public static void main(String[] args) {
    String c = "2";
    while (c.compareTo("1") != 0) {
      System.out.println("Molq vyvedete 2 chisla:");
      Scanner sc = new Scanner(System.in);
      String a = sc.next();
      String b = sc.next();
      System.out.println(StringSum.sum(a, b));
      System.out.println("za prekysvane natisnete 1!");
      c = sc.next();
    }

  }
}
