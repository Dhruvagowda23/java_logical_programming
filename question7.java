import java.util.HashMap;
import java.util.Map;
public class question7 {
  public static void findMostAndLeastFrequentWord(String sentence){
    String[] words = sentence.toLowercase().split("\\s+");
    Map<String, Integer> wordFrequencyMap = new HashMap<>();
    for (String word : words){
      wordFrequencyMap.put(word,wordFrequencyMap.getOrDefault(word,0) + 1);
    }
    String mostFrequentWord = null;
    String leastFrequentWord =null;
    int maxFrequency = Integer.MIN_VALUE;
    int minFrequency = Integer.MAX_VALUE;
    for (String word : wordFrequencyMap.keyset()){
      int frequency = WordFrequencyMap.get(word);
      if(frequency > maxFrequency){
        maxFrequency = frequency;
        mostFrequentWord = Word;
        
      }
      if(frequency < minFrequency){
        maxFrequency = frequency;
        leastFrequentWord = Word;
    }
  }
    System.out.println("The most frequent word is:" + mostFrequentWord);
    System.out.println("The least frequent word is:" +leastFrequentWord);
  
}
  public static void main(String[] args){
    String sentence = "the dog jumped over the fence and ran away.the cat and the dog jumped over the fence and ran away";
    findMostAndLeastFrequentWord(senetcne);
  }
}