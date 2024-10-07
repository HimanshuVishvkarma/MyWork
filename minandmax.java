public class minandmax{
    public static int MaxValue(int arr[]){
        int largnumber = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largnumber<arr[i]){
                largnumber = arr[i];
            }
        }
        return largnumber;
    }
    public static int SmallValue(int arr[]){
        int Smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if (Smallest>arr[i]) {
                Smallest = arr[i];
            }
        }
        return Smallest;
    }
    public static void main(String[] args) {
        int arr[] = {22, 33, 55, 11, 77};
        System.out.println("\nYour Array IS:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nYour Array Large Number IS: = "+MaxValue(arr));
        System.out.println("Your Array Smallest Number IS: = "+SmallValue(arr));

    }
}
