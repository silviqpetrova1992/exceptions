package intscanner;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/21/15.
 */
public class DoubleScannerDemo {
  //Ne zabravqi da pita6 za double octal zashto go otchita taka!!!
  public static void main(String[] args) {
    int i = 5;
    String a;
    DoubleScanner dsc = new DoubleScanner();
    Scanner sc = new Scanner(System.in);
    while (i != 0) {
      try {
        a = sc.nextLine();
        if (a.matches("0[0-9]+")) {
          throw new NumberFormatException("There is no existing number starting with 0, except 0!");
        } else {
          dsc.checkInterval(Double.parseDouble(a));
        }
      } catch (OutOfIntervalException e) {
        System.out.println(e.getMessage());
      } catch (NumberFormatException ex) {//This is RuntimeException!!!
        System.out.println("Incorrect input parameter!"+ ex.getMessage());
        sc = new Scanner(System.in);
      }
      i--;
    }
  }
}
