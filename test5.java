public class test5 {
    public static boolean isSquare(int arr[][]){
    int row = arr.length;
    int column = arr[0].length;
    boolean sqr = false;
    for(int i = 0; i<arr.length; i++){
        for(int j = 0; j<arr[0].length; j++){
            if (row==column) {
                sqr = true;
                System.out.print(arr[i][j]+" ");

             }
        }
        System.out.println();
    }
    
    return sqr;
    }
 
    public static void main(String[] args) {
        int arr[][] = {{2,3,6},{1,2,7},{1,2,3},};
       System.out.println("your 2d array is squer: "+ isSquare(arr));
    }
    
}
