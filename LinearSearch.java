
public class LinearSearch {
    public static int lsearch(int number[], int key){
        for(int i=0; i<number.length; i++){
             {
             if(number[i]==key){
             return i;
             }
            
             }
          
        }
        return -1;
    }
    public static void main(String args[]) {
        int number [] = {2, 4, 6, 8, 10};
        int key = 8;
    System.out.println(lsearch(number, key));
    }
}
