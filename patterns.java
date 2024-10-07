

public class patterns {
   public static int patternsA (int i, int j){
    for(i=1;i<=5; i++){
        for(j=1; j<=5;j++){
           if (i<=j) {
               System.out.print("*");
           }
        }
        System.out.println();
     }
     return patternsA(i, j);
      
   }
   public static void main(String[] args) {
    System.out.print(patternsA(5, 5));
   }
}
