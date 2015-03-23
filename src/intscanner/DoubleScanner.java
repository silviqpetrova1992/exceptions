package intscanner;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/23/15.
 */
public class DoubleScanner {
  /**
   * Check if the number is in this interval [0,100].
   *
   * @param a
   * @throws OutOfIntervalException
   */
  public void checkInterval(double a) throws OutOfIntervalException {
    if (a >= 0 && a <= 100) {
      System.out.println("The number you entered is OK");
    } else {
      throw new OutOfIntervalException("The number you entered is out of interval");
    }
  }
}
