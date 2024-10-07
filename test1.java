import java.util.*;
public class test1 {
    public static void reverseArr(int numberArray[]){
        int First = 0, last = numberArray.length-1;
        while (First<last) {
            int temp = numberArray[last];
            numberArray[last] = numberArray[First];
            numberArray[First] = temp;
            First++;
            last--;        
        }
  }
    public static int largest(int numberArray[]){
        int largnumber = Integer.MIN_VALUE;
        for(int i=0; i<numberArray.length; i++){
            if(largnumber < numberArray[i]){
                largnumber = numberArray[i];
            }
        }
        return largnumber;
    }
    public static int secondLargest(int numberArray[]){
        int Highest1 = Integer.MIN_VALUE;
        int Highest2 = Integer.MIN_VALUE;
        for(int i=0; i<numberArray.length; i++){
            if(Highest1<numberArray[i]){
                Highest2 = Highest1;
                Highest1 = numberArray[i];
            }else if(Highest2<numberArray[i]){
                Highest2 = numberArray[i];
            }
        }
        return Highest2;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Length of Array:");
        int number = sc.nextInt();
        int numberArray [] = new int[number];
        System.out.println("Enter Your Array Elements:");
        for(int i=0; i<number; i++){
            numberArray[i] = sc.nextInt();
        }
        System.out.println("Your Array is:");
        for(int i=0; i<number; i++){
            System.out.print(numberArray[i]+" ");
        }
        System.out.print("\nYour First largest Number is:\n"+largest(numberArray));
        System.out.println("\nYour Second Largest Number is:\n"+secondLargest(numberArray));
        reverseArr(numberArray);
        System.out.println("Your Revers Array is:");
        for(int i=0; i<numberArray.length; i++){
           System.out.print(numberArray[i]+" ");
        }
        System.out.println();
    }
}
