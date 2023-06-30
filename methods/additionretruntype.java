import java.util.Scanner;
class Method_example
  {
    int c;
    int add(int a , int b)
    {
      c=a+b;
      return c;
    }
    int sub(int a ,int b)
    {
      c=a-b;
      return c;
    }
    int mul(int a, int b)
    {
      c=a*b;
    return c;
    }
     int div(int a, int b)
    {
      c=b/a;
     return c;
    }
     int mod(int a , int b)
    {
      c=b%a;
     return c;
    }
    
    
  }
public class additionretruntype
  {
    public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      int a, b,z;
      System.out.println("enter the values of a and b");
      a = sc.nextInt();
      b = sc.nextInt();
      Method_example m1 = new Method_example();
      z=m1.add(a , b);
      System.out.println("The addition is:" +z);
      z=m1.sub(a , b);
      System.out.println("The subtraction is:" +z);
      z=m1.mul(a , b);
      System.out.println("The multiplication is:" +z);
      z=m1.div(a,b);
      System.out.println("The division is:" +z);
      z=m1.mod(a,b);
      System.out.println("The modulos is:" +z);
    }
  }