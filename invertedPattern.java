public class invertedPattern {
       public static void InvertP(int row, int col){
           for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                 if (j<=col-i) {
                    System.out.print(" ");
                 }
                 else{
                    System.out.print("*");
                 }
            }
            System.out.println();
           }  
       }
    public static void main(String[] args) {
        InvertP(10, 10);
    }
}
