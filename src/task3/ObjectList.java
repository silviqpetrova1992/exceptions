package task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/21/15.
 */
public class ObjectList {
  private final int n = 4;
  private ArrayList<Object> array;

  public ObjectList() {
    this.array = new ArrayList<Object>();
  }

  public void add(Object obj) throws FullListException {

    if (array.size() >= n) {
      throw new FullListException("!!!!!!The list is full! Sorry you can't add more elements!!!!!!");
    } else {
      array.add(obj);
    }
  }

  public void remove() throws EmptyListException{
    if (array.size() == 0) {
      throw new EmptyListException("!!!!!!The List is empty! You can't delete!!!!!!");
    } else {
      array.remove(array.size()-1);
    }
  }

  public void printAllElements() {
    Iterator<Object> it = array.iterator();
    for (Object obj : array) {
      System.out.println(obj.toString());
    }
  }
}
