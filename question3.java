import java.util.Scanner;
public class question3 {
  Public Static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Wlecome to the student grade analyzer");
    System.out.print("Enter the number of students");
    int numStudents=Scanner.nextInt();
    int[] grades =new int[numStudents];
    System.out.println("Enter the grades for each student");
    for(int i=0;i<numStudents;i++){
      System.out.print("Student"+(i+1)+":");
      grades[i]= scanner.nextInt();
    }
    int numAbove80 =0;
    int numBetween60And80 =0;
    int numBelow60 = 0;
    for (int grade : grades){
      if(grade>80){
        numAbove80++;
      }
      else if(grade>=60 && grade<=80){
        numBetween60And80++;
      }else{
        numBelow60++;
      }
      }
    System.out.println("Number of students secured more than 80 marks:"+numAbove80);
    System.out.println("Number of students secured in between 60-80 marks:"+numBetween60And80);
    System.out.println("Number of students secured below 60 marks:"+numBelow60);
  }
}