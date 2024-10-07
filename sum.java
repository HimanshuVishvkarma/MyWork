import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
       long n = sc.nextInt();
       long a =0;
       for(int i = 1; i<=n; i++){
       a = a+i;
       System.out.println(i);
       }
       System.out.println("Sum of Natural Num is: " +a);
    }
    
}
