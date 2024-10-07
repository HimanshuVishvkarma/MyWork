public class test6 {
    public static boolean findindexvalue(int arr[], int key){
        boolean sumoftwoindex = false;
        for(int i=0; i<arr.length; i++){
            int First = arr[i];
            for(int j=1; j<arr.length; j++){
                 int second = arr[j];
                 for(int z=0; z<arr.length; z++){
                    int sum = arr[i]+arr[j];
                    if (sum==key) {
                        sumoftwoindex = true;
                        System.out.println(i+" "+j);
                         
                    }
                 }

                 
            }
        }

        return sumoftwoindex;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,7,8,9,2,20};
        int key = 15;
        System.out.println(findindexvalue(arr, key));
    }
}
