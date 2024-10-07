public class test9 {
    public static void main(String[] args) {
        int large = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sort = 0;
        int arr[] = {21,3,55,8,1,99};
        System.out.println("Your Present Array is :");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i <arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    sort = arr[i];
                    arr[i] = arr[j];
                    arr[j] = sort;
                }
            } 
            System.out.print(arr[i]+" ");
        }
        for(int i=0; i<arr.length; i++){
            if (large<arr[i]) {
                large = arr[i];                
            }
            
        }
        System.out.println("Large number is: "+large);
        for(int i=0; i<arr.length; i++){
            if (min>arr[i]) {
               min = arr[i];                
            }
        }
        System.out.println("Your Smallest number is: "+min);
    }
}
