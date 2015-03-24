package task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/21/15.
 */
public class ObjectList {
 private  int n = 0;
  private Object[] array;

  /**
   * Constructor eith one parameter
   * @param n The length of the array.
   */
  public ObjectList(int n) {
    this.array = new Object[n];
  }

  /**
   * Add an Object to the list
   *
   * @param obj The object that we want to add
   * @throws FullListException If the list is already full.
   */
  public void add(Object obj) throws  ArrayIndexOutOfBoundsException{

    if (array.length <= n) {
      throw new ArrayIndexOutOfBoundsException("!!!!!!The list is full! Sorry you can't add more elements!!!!!!");
    } else {
      array[n]=obj;
      n++;
    }
  }

  /**
   * Remove an element from the list
   *
   * @throws EmptyListException Id the list is empty.
   */
  public void remove() throws ArrayIndexOutOfBoundsException {
    if (n == 0) {
      throw new ArrayIndexOutOfBoundsException("!!!!!!The List is empty! You can't delete!!!!!!");
    } else {
      array[--n]=0;
   }
  }

  /**
   * Print the list.
   */
  public void printAllElements() {
    for(int i=0;i<n;i++){
      System.out.println(array[i]);
    }
  }
}
