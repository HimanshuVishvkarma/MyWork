import java.util.Scanner;

public class test2 {
    public static int secondLargest(int array[][]){
        int Highest1 = Integer.MIN_VALUE;
        int Highest2 = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(Highest1<array[i][j]){
                    Highest2 = Highest1;
                    Highest1 = array[i][j];
                }else if(Highest2<array[i][j]){
                    Highest2 = array[i][j];
                }
                }
            }
            return Highest2;
    }
    public static int largest(int array[][] ){
        int largnumber = Integer.MIN_VALUE;
        
        for(int i=0; i<array.length; i++){
        for(int j=0; j<array[0].length; j++){
            if(largnumber < array[i][j]){
                largnumber = array[i][j];
               }
            }
    }
        return largnumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Row of array:");
        int row = sc.nextInt();
        System.out.println("Enter Your Column of araay:");      
        int column = sc.nextInt();
        int array[][] = new int[row][column];
        System.out.println("Enter Your 2D Array Element:");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your 2D Araay Is :");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
               System.out.print( array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Your First large number is:"+largest(array) );
        System.out.println("Your Second Large number is:"+secondLargest(array));
    }
}
