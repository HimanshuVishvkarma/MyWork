public class test3 {
    public static int sumOflast(int arr[][]){
        int sum = 0;
        for(int j = 0; j<arr.length; j++){
            sum += arr[2][j];
        }
        return sum;
    }
    public static int sumOfmidnum(int arr[][]){
        int sum = 0;
        for(int j =0; j<arr.length;j++){
           sum +=arr[1][j]; // sum of 2nd row of array
        }
       
    return sum;
    }
    public static void main(String[] args) {
      
        int arr[][] = {{39,40,50}, {12,22,33}, {21, 32,34}};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of second row = "+sumOfmidnum(arr));
        System.out.println("sum of last row = "+sumOflast(arr));
    }
}
