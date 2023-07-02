import java.util.Scanner;
  class Demo1
  {
  Scanner sc = new Scanner(System.in);

  void alfa() {
    int n;
    System.out.println("Enter the digit ");
    n=sc.nextInt();
    if((n%5==0)&&(n%11==0))
    {
     System.out.println("is divsible bye 5 and 11");
    }
    else{
      System.out.println("is not divsible by 5 and 11");
      
    }
  }
  }

    class five
      {
         public static void main(String args[]) {
           Demo1 d = new Demo1();
           d.alfa();
         }
      }