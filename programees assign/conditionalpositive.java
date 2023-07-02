import java.util.Scanner;

public class conditionalpositive
  {
  public static void main(String[] args) {
    int a;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of a");
    a = sc.nextInt();
    if (a > 0) {
      System.out.println("entered value is positive");
    } else {
      System.out.println("entered value is negative");
    }
  }
}