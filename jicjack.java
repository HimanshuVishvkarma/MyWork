import java.util.Scanner;

public class jicjack {
    public static void main(String[] args) {    
     int row,col;

     for(row=1;row<=11;row++){
        for(col=1;col<=3;col++){
            if (row==col ||  row==col+4 || row==col+8) 
            {
              System.out.print("*");  
            }
            System.out.print(" ");
        }
        System.out.println();
     }
      

    }
}
