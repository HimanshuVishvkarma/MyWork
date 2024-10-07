import java.util.Scanner;
public class ncr {
    public static void NcR(int n, int r, int p){
        long factn = 1;
        long factr = 1;
        long factp = 1;
        long Ncr = 0;
        for(int i=1; i<=n; i++){
           factn *=i;
        }
        for(int i=1; i<=r; i++){
            factr *=i;
         }
         for(int i=1; i<=p; i++){
            factp *=i;
         }

       Ncr = factn/(factr*factp);
       System.out.println(Ncr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N and R:");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int p = n-r;
        System.out.println("NCR is:");
        NcR(n, r, p);

    }
}
