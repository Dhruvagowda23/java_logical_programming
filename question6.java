import java.util.Arrays;
 public class question6 {
   public static boolean areAnagrams(String str1, String str2) {
     if (str1.length() !=str2.length()) {
       return false;
       
     }
     char[] charArray1 str1.toCharArray();
     char[] charArray1 str2.toCharArray();
     Arrays.sort (charArray1);
     Arrays.sort (charArray2);
     return Arrays.equals(charArray1,charArray2);
    
   }
   public static void main(String[] args) {
     String username1 = "alex";
     String ur11 = "xela";
      String username1 = "JAVA";
     String ur11 = "SJAV";
     if (areAnagrams(username1,ur11)) {
       System.out.println("user 1: Your URL is unique");
     }else{
       System.out.println("user 1: Your URL is  not unique");
      
     }
      if (areAnagrams(username2,ur12)) {
       System.out.println("user 2: Your URL is unique");
     }else{
       System.out.println("user 2: Your URL is  not unique");
      
     
     }
     
   }
 }