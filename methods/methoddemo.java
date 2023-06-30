import java.util.Scanner;

class method_Example
  {
  int c;

  void add(int x, int y)
  {
    c = x + y;
    System.out.println("The addition value is:" + c);

  }
}

Class methoddemo{

  public static void main(String argsp[]) {
    Scanner sc = new Scanner(System.in);
    int x, y;
    System.out.println("Enter a and b values");
    a = sc.nextInt();
    b = sc.nextInt();
    method_Example m1 = new method_Example();
    m1.add(a, b);

  }
}