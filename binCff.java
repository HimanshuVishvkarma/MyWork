public class binCff {
    public static int Factorial(int n){
         int f = 1;
         for(int i=1; i<=n; i++){
            f *=i;
         }
         return f;
    }
    public static int binomialCoff(int n, int r){
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fac_nmr = Factorial(n-r);

        int biono = fact_n/(fact_r*fac_nmr);
        return biono;
    }
    public static void main(String[] args) {
        System.out.println("Your Bionomial Cofficient is :"+ binomialCoff(5, 2));
    }
}
