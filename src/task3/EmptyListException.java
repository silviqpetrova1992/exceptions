package task3;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/21/15.
 */
public class EmptyListException extends Exception {
  public EmptyListException() {

  }

  public EmptyListException(String message) {
    super(message);
  }

  public EmptyListException(Throwable th) {
    super(th);
  }

  public EmptyListException(String mes, Throwable th) {
    super(mes, th);
  }
}
