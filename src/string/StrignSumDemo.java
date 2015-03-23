package string;

import java.util.Scanner;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/23/15.
 */
public class StrignSumDemo {
  public static void main(String[] args) {
    String c = "2";
    StringSum stsum=new StringSum();
    while (c.compareTo("1") != 0) {
      System.out.println("Molq vyvedete 2 chisla:");
      Scanner sc = new Scanner(System.in);
      String a = sc.next();
      String b = sc.next();
      System.out.println(stsum.sum(a, b));
      System.out.println("za prekysvane natisnete 1!");
      c = sc.next();
    }

  }

}
