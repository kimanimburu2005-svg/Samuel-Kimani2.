import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====================================");
        System.out.println("WHILE LOOP DEMONSTRATION");
        System.out.println("=====================================");
        System.out.println("Student: Samuel Kimani");
        System.out.println();

        System.out.print("Enter a number: ");
        int limit = input.nextInt();

        int counter = 1; 

        System.out.println("\nPrinting numbers from 1 to " + limit + ":");

       
        while (counter <= limit) {
            System.out.print(counter);
            
            // Add comma and space for better formatting, except for the last number
            if (counter < limit) {
                System.out.print(", ");
            }
            
            counter++; 
        }
        System.out.println("\n\nLoop executed " + (counter - 1) + " times.");
        System.out.println("=====================================");

        input.close();
    }
}
