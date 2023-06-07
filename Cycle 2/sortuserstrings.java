import java.util.Arrays;
import java.util.Scanner;

public class sortuserstrings {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Name : Anna Jose");
      System.out.println("Register Number : SJC22MCA-2008");
      System.out.println("Course Name : Object Oriented Programming Lab");
      System.out.println("Course Code : 20MCA132");
      System.out.println("Date : 04/04/2023");
      System.out.print("Enter the number of strings you want to sort: ");
      int n = input.nextInt();
      String[] names = new String[n];
      
      System.out.println("Enter the strings to be sorted:");
      for (int i = 0; i < n; i++) {
         names[i] = input.next();
      }
      
      Arrays.sort(names);

      System.out.println("Sorted Names: ");
      for (String name : names) {
         System.out.println(name);
      }
   }
}

