package intscanner;

import java.io.IOException;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/21/15.
 */
public class OutOfIntervalException extends Exception{
  public OutOfIntervalException() {

  }

  public OutOfIntervalException(String message) {
    super (message);
  }

/*  public OutOfIntervalException(Throwable cause) {
    super (cause);
  }

  public OutOfIntervalException(String message, Throwable cause) {
    super (message, cause);
  }*/

}
