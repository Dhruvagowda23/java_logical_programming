import java.util.Scanner;
public class conditionalseven
  {
    public static void main(String [] args)
    {
      int a;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the value of a");
      a = sc.nextInt();
      if(a%2 == 0)
      {
        System.out.println("entered value is even");
      }
      else
      {
        System.out.println("entered value is odd");
      }
    }
  }