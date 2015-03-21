package task3;

import java.util.Scanner;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/21/15.
 */
public class ObjectListDemo {
  public static void main(String[] args) {
    ObjectList ol = new ObjectList();
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
          try {
            ol.add(sc.next());
          } catch (FullListException e) {
            System.out.println(e.getMessage());
          }
          break;
        case '2':
          try {
            ol.remove();
            System.out.println("The delete operation is successful!");
          } catch (EmptyListException e) {
            System.out.println(e.getMessage());
          }

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