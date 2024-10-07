import java.util.Scanner;

public class TaxzCalulator {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter Your Income:");
       float Sallry =  input.nextFloat();
       if(Sallry<=500000){
        System.out.println("Your Tax Is:" + 0 +"Rs");
         }if (Sallry>500000 && Sallry<1000000) {
            System.out.println("Your Tax Is: "+ Sallry*0.2 +"Rs");
            
         }if(Sallry>1000000){
            System.out.println("Your Tax Is:" +Sallry*0.3 +"Rs");
         }

         
    }
    
}
