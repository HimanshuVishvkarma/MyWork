import java.util.*;
public class test {
    public static int larsg(int number []){
      int largest = Integer.MIN_VALUE;
      for(int i=0; i<number.length; i++){
        if(largest < number[i]){
            largest = number[i];
        }
      }
      return largest;
    }
      public static void main(String[] args) {
        int number [] = { 3, 2, 6, 8, 1, 10 };
        System.out.println("Largest value is:"+ larsg(number));
      }    
}
