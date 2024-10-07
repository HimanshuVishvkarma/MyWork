public class test11 {
    public static int largestnum(int arr[]){
        
    }
    public static void reversedarray(int arr[]){
        int First = 0, last = arr.length-1;
        System.out.println("\nChanged Array IS:");
        while (First<last) {
              int temp = arr[last];
              arr[last] = arr[First];
              arr[First] = temp;
              First++;
              last--;
        }
        for(int i=0; i<arr.length; i++){  
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println("Array Is:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
     reversedarray(arr);
    }
}
