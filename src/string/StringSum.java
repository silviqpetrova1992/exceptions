package string;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/21/15.
 */
public class StringSum {
  /**
   * Calculate the sum of two numbers: a and b
   *
   * @param a The first number
   * @param b The second number
   * @return sum This is the sum of a and b
   */
  public String sum(String a, String b) {
    String sum;
    try {
      sum = String.valueOf(Double.parseDouble(a) + Double.parseDouble(b));
    } catch (NumberFormatException e) {
      sum = "You didn't enter only numbers! You entered " + e.getMessage();
    }
    return sum;
  }

}
