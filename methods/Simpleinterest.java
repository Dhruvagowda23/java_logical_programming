import java.util.Scanner;
public class Simpleinterest
  {
    public static void main(String [] args)
    {
      int p,r,t,si;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the principal amount");
      p = sc.nextInt();
       System.out.println("enter the Rate");
      r = sc.nextInt();
      System.out.println("enter the time");
      t = sc.nextInt();
        si  = (p*r*t)/100; 
     System.out.println("principal amount is "+p);
       System.out.println("rate is "+r);
       System.out.println("time is "+t);
       System.out.println("simple interest is "+si);
    }
  }