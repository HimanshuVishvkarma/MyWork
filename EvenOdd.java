import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class EvenOdd {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Your Number:");
  int Num = sc.nextInt();
  int SumOfEven = 0;
  int SumOfOdd = 0;
  if(Num==0){
    System.out.println("Your Number is Even:");
    System.out.println("Your Number is Zero so i can not find the sum of your Number:");
    return;
  }
  for(int i = 1; i<=Num; i++){
    if(i%2==0){
         SumOfEven = SumOfEven+i;
         System.out.println("Even Number " +i);
    }else{
      SumOfOdd = SumOfOdd+i;
      System.out.println("Odd Number: " +i);
    }
    
  }
  System.out.println("\nSum of Even: "+SumOfEven);
    System.out.println("sum of odd : "+SumOfOdd);
}
  }
