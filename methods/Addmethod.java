class Method_example
  {
    int a=10,b=20;
    int c;
    void add()
    {
      c=a+b;
      System.out.println("The addition of 2 numbers is "+c);
    }
    void sub()
    {
      c=a-b;
      System.out.println("the subrtraction of 2 numbers is "+c);
    }
    void mul()
    {
      c=a*b;
      System.out.println("the product of 2 numbers is "+c);
    }
     void div()
    {
      c=b/a;
      System.out.println("the division of 2 numbers is "+c);
    }
     void mod()
    {
      c=b%a;
      System.out.println("the modulus of 2 numbers is "+c);
    }
    
    
  }
public class Addmethod
  {
    public static void main(String [] args)
    {
      Method_example m1 = new Method_example();
      m1.add();
      m1.sub();
      m1.mul();
      m1.div();
      m1.mod();
    }
  }