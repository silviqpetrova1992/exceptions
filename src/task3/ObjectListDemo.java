package task3;

import java.util.Scanner;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/21/15.
 */
public class ObjectListDemo {
  public static void main(String[] args) {
    ObjectList ol = new ObjectList(3);
    String a = "1";
    while (a != "4") {
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("Please, select 1 if you want to ADD an element to your list!");
      System.out.println("Please, select 2 if you want to REMOVE an element to your list!");
      System.out.println("Please, select 3 if you want to PRINT an element to your list!");
      System.out.println("Please, select 4 if you want to CLOSE the program!");
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      Scanner sc = new Scanner(System.in);
      a = sc.next();
      switch (a.charAt(0)) {
        case '1':
          System.out.println("Please, enter an element:");
          ol.add(sc.next());
          break;
        case '2':
          ol.remove();
          break;
        case '3':
          ol.printAllElements();
          break;
        case '4':
          return;
        default:
          System.out.println("Uncorrenct choise!");
      }
    }

  }
}
