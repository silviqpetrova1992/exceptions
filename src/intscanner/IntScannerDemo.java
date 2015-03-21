package intscanner;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/21/15.
 */
public class IntScannerDemo {
  static public void checkInterval(double a) throws OutOfIntervalException {
    if (a >= 0 && a <= 100) {
      System.out.println("The number you entered is OK");
    } else {
      throw new OutOfIntervalException("The number you entered is out of interval");
    }
  }

  public static void main(String[] args) {
    int i = 5;
    double a;
    Scanner sc = new Scanner(System.in);
    while (i != 0) {

      try {
         a = sc.nextDouble();
        checkInterval(a);
      } catch (OutOfIntervalException e) {
        System.out.println(e.getMessage());
      }
    catch(InputMismatchException ex){//This is RuntimeException!!!
      System.out.println("Incorrect input parameter!");
      sc=new Scanner(System.in);
    }
    i--;
  }
}
}
