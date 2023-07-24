import java.util.scanner;
public class question{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the number of games played:");
    int numGames = scanner.nextInt();
    int[] team1scores = new int[numGames];
    int[] team2scores = new int[numGames];

    for (int i =0; i< numGames; i++){
      System.out.println("Game" + (i + 1)+ " Team 1 score:");
      team1scores[i] = scanner.nextInt();
       System.out.println("Game" + (i + 1)+ " Team 2 score:");
      team2scores[i] = scanner.nextInt();
    }
    int team1Highest = findHighestScore(team1Scores);
    int team1Lowest = findLowestScore(team1Score);
    double team1Average = calculateAverageScore(team1Score);
    int team2Highest = findHighestScore(team2Scores);
    int team2Lowest = findLowestScore(team2Score);
    double team2Average = calculateAverageScore(team2Score);
    System.out.println("Team 1 Highest score:" + team1Highest);
    System.out.println("Team 1 Lowest score:" + team1Lowest);
    System.out.println("Team 1 Average score:" + team1Average);
    System.out.println("Team 2 Highest score:" + team2Highest);
    System.out.println("Team 2 Lowest score:" + team2Lowest);
    System.out.println("Team 2 Average score:" + team2Average);
    if (team1Average > team2Average){
      System.out.println(" Team 1 wins the tournamenet");
      
        } else if(team1Average < team2Average) {
          System.out.println(" Team 2 wins the tournamenet");
      
        } else{
      System.out.println("Tournament ended in a tie");
        }
    Scanner.close();
  }
  private static int findHighestScore(int[] scores)
  {
    int highest = scores[0];
    for(int i =i; i<scores.length; i++){
      if(scores[i] > highest){
        highest = scores[i];
        
      }
    }
    return highest;
  }
   private static int findLowestScore(int[] scores){
    int lowest = scores[0];
    for(int i =i; i<scores.length; i++){
      if(scores[i] < lowest){
        lowest = scores[i];
}
    }
     return lowest;
   }
  private static double calcualateAveragescore(int[] scores)
  int sum = 0;
  for (int score : scores) {
  sum  += score;
}
retrun (double) sum / scores.length;
}
}

  }