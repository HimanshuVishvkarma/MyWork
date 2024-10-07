import java.util.*;
public class fibonacci {
    public static void fibo(int number){
        int num1 = 0, num2 = 1;
        System.out.print("Your Fibonacci sereas is:\n"+num1+" "+num2+" ");
        for(int i=1; i<number-1; i++){
            int fiboserieas = num1+ num2;
            num1 = num2;
            num2 = fiboserieas;
            System.out.print(fiboserieas+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Range:");
        int number = sc.nextInt();
        fibo(number);
    }
}
