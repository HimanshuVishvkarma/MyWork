public class test7 {
    public static void main(String[] args) {
        int arr[][] = {{2,3,4},{5,6,7},{7,8,9}};
        System.out.println("Array Is:");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
             System.out.print(+arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Your array boundry is:");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){ 
                if (i==0 || j==0 || i==arr.length-1 || j==arr[0].length-1 ) {
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
