package task3;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/21/15.
 */
public class FullListException extends Exception {
  public FullListException() {

  }

  public FullListException(String message) {
    super(message);
  }

  public FullListException(Throwable th) {
    super(th);
  }

  public FullListException(String mes, Throwable th) {
    super(mes, th);
  }
}
