import java.util.Arrays;
public class Sort {
public static void main(String[] args) {
System.out.println("Name : Anna Jose");
System.out.println("Register Number : SJC22MCA-2008");
System.out.println("Course Name : Object Oriented Programming Lab");
System.out.println("Course Code : 20MCA132");
System.out.println("Date : 04/04/2023");
String str = "OOP LAB";
char array[] = str.toCharArray();
Arrays.sort(array);
str = new String(array);
System.out.println(str);
}
}

