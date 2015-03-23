package intscanner;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/21/15.
 */
public class DoubleScannerDemo {
  public static void main(String[] args) {
    int i = 5;
    double a = 0234;
    DoubleScanner dsc = new DoubleScanner();
    System.out.println(a);
    Scanner sc = new Scanner(System.in);
    while (i != 0) {
      try {
        a = sc.nextDouble();
        dsc.checkInterval(a);
      } catch (OutOfIntervalException e) {
        System.out.println(e.getMessage());
      } catch (InputMismatchException ex) {//This is RuntimeException!!!
        System.out.println("Incorrect input parameter!");
        sc = new Scanner(System.in);
      }
      i--;
    }
  }
}
