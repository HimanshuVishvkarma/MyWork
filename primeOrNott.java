public class primeOrNott {
    public static void NumPrime(int num){
        boolean isPrime = true;
        for(int i=3; i<=num; i++){
            if (num%i==0) {
           continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        NumPrime(100);
    }
}
