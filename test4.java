public class test4 {
    public static int sumOfall(int arr[][]){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
               sum += arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][] = {{2,3,4},{3,2,2},{2,1,8}};
        System.out.println("ARRAY IS: ");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int count2 = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
               if(arr[i][j] == 2){
                count2++;
               }
            }
          
        }
        System.out.println("Total 2's  IS in the  2D  Array = "+count2);
        System.out.println("Sum of All Element in the Array = "+sumOfall(arr));


    }
    
}
