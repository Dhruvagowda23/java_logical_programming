class Method_example
  {
    int sno=150,s1=40,s2=50,s3=48,sum;
    String sname="Dhruva";
    float avg;
    void sum()
    {
      sum = (s1+s2+s3);
      System.out.println("The total marks "+sum);
    }
    void average()
    {
      avg = (float)(sum)/3;
      System.out.println("the average of 3 subject marks is "+avg);
    }
    
  }
public class Studentmethod
  {
    public static void main(String [] args)
    {
      Method_example m1 = new Method_example();
      m1.sum();
      m1.average();
      
    }
  
    }
