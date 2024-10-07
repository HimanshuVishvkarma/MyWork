import java.util.Scanner;

public class SwitchCase {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Week of Day Number: 0 to 7:");
             int week = sc.nextInt();
             switch (week) {
                case 1: System.out.println("Monday");
                    
                    break;
                case 2: System.out.println("Tueday:");
                    break;
                case 3: System.out.println("Wednesday:");
                    break;
                case 4: System.out.println("Thursday");
                    break;
                case 5: System.out.println("Friday:");
                    break;
                case 6: System.out.println("Saturday:");
                    break;
                case 7: System.out.println("Sunday:");
                    
                default: System.out.println("Your are Entered Invailid Value :");
                    break;
             }
        }    
}
