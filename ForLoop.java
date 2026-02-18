import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====================================");
        System.out.println("FOR LOOP DEMONSTRATION");
        System.out.println("=====================================");
        System.out.println("Student: Samuel Kimani");
        System.out.println();

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("\n--- Descending Number Pattern ---");
        System.out.println("For input " + num + ":\n");

        for (int start = num; start >= 1; start--) {
           
            for (int i = start; i >= 0; i--) {
                System.out.print(i);
            }
            System.out.println(); 
        }
        
        System.out.println("\n" + "=".repeat(40));
        System.out.println("Pattern completed successfully!");
        System.out.println("=".repeat(40));

        input.close();
    }
}
