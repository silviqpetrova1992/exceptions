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

  /**
   * Construct the object without parameters
   */
  public ObjectList() {
    this.array = new ArrayList<Object>();
  }

  /**
   * Add an Object to the list
   *
   * @param obj The object that we want to add
   * @throws FullListException If the list is already full.
   */
  public void add(Object obj) throws FullListException {

    if (array.size() >= n) {
      throw new FullListException("!!!!!!The list is full! Sorry you can't add more elements!!!!!!");
    } else {
      array.add(obj);
    }
  }

  /**
   * Remove an element from the list
   *
   * @throws EmptyListException Id the list is empty.
   */
  public void remove() throws EmptyListException {
    if (array.size() == 0) {
      throw new EmptyListException("!!!!!!The List is empty! You can't delete!!!!!!");
    } else {
      array.remove(array.size() - 1);
    }
  }

  /**
   * Print the list.
   */
  public void printAllElements() {
    Iterator<Object> it = array.iterator();
    for (Object obj : array) {
      System.out.println(obj.toString());
    }
  }
}
