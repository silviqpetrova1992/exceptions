package task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/21/15.
 */
public class ObjectList {
  private int n = 0;
  private Object[] array;

  /**
   * Constructor with one parameter
   *
   * @param n The length of the array.
   */
  public ObjectList(int n) {
    this.array = new Object[n];
  }

  /**
   * Add an Object to the list
   *
   * @param obj The object that we want to add.
   */
  public void add(Object obj) {
    try {
      array[n] = obj;
      n++;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("!!!!!The list if full!You can't add more elements!!!!!");
    }
  }

  /**
   * Remove an element from the list
   */
  public void remove() {
    try {
      n--;
      System.out.println("The delete operation is successful! You deleted: " + array[n]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("!!!!!The list is empty! You can't delete an element!!!!!");
    }
  }

  /**
   * Print the list.
   */
  public void printAllElements() {
    for (int i = 0; i < n; i++) {
      System.out.println(array[i]);
    }
  }
}
