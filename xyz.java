import java.util.Scanner;

public class xyz{
    public static void Fibonacci(int n){
        int first = 0;
        int secand = 1;
        System.out.print(first+" "+secand+" ");
        for(int i=1; i<n-1; i++){
            int fibo = first+secand;
                first = secand;
                secand = fibo;
                System.out.print(fibo+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Number:");
        int n = sc.nextInt();
        int a =1;
        for(int i=1;i<=n;i++){
             a *=i;
        }
        System.out.println("factorial is:"+a);
        Fibonacci(n);

    }
    
}
