public class test10 {
    static void xyz(int arr[], int arr2[]){
        
        System.out.println("\nChanged Array IS: ");
       for(int i=0; i<arr.length; i++){
            arr[i] = arr[i]*arr[i];
            System.out.print(arr[i]+" ");
            arr2[i] = arr[i];
       }
       System.out.println();
       for(int i=0; i<arr2.length; i++){
        for(int j=i+1; j<arr2.length; j++){
             if (arr2[i]>arr2[j]) {
                int temp = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = temp;
            }
         }
         
      }
      System.out.println("Sorted Array in Asscending Order IS: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
  }
    public static void main(String[] args) {
        int arr[] = {-4, -1, 0, 3, 10};
        int arr2 [] = new int[arr.length];
        System.out.println("your array is:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        xyz(arr, arr2);
    }
}
