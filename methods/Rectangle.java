// programe to find area and circumference of rectangle
import java.util.Scanner;
public class Rectangle
  {
    public static void main(String [] args)
    {
      int l,b,area,circum;
      Scanner sc = new Scanner (System.in);
      System.out.println("enter the length of rectangle");
      l=sc.nextInt();
      System.out.println("enter the bredth of rectangle");
      b=sc.nextInt();
      area=l*b;
      circum=2*(l+b);
      System.out.println("area of rectangle is "+area);
      System.out.println("circumference of a rectangle is "+circum);
    } 
  }
