import java.util.Scanner;
class Method_example
  {
    int c;
    void add(int a , int b)
    {
      c=a+b;
      System.out.println("The addition of 2 numbers is "+c);
    }
    void sub(int a ,int b)
    {
      c=a-b;
      System.out.println("the subrtraction of 2 numbers is "+c);
    }
    void mul(int a, int b)
    {
      c=a*b;
      System.out.println("the product of 2 numbers is "+c);
    }
     void div(int a, int b)
    {
      c=b/a;
      System.out.println("the division of 2 numbers is "+c);
    }
     void mod(int a , int b)
    {
      c=b%a;
      System.out.println("the modulus of 2 numbers is "+c);
    }
    
    
  }
public class addition
  {
    public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      int a, b;
      System.out.println("enter the values of a and b");
      a = sc.nextInt();
      b = sc.nextInt();
      Method_example m1 = new Method_example();
      m1.add(a , b);
      m1.sub(a , b);
      m1.mul(a , b);
      m1.div(a,b);
      m1.mod(a,b);
    }
  }