import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====================================");
        System.out.println("DO-WHILE LOOP DEMONSTRATION");
        System.out.println("=====================================");
        System.out.println("Student: Samuel Kimani");
        System.out.println();

        int correctStudentNumber = 12345; 
        String correctPassword = "samuel2024";

        int enteredNumber;
        String enteredPassword;
        boolean isAuthenticated = false;
        int attemptCount = 0;

        System.out.println("--- Authentication System ---");
        System.out.println("(Try entering wrong credentials first, then correct ones)");
        System.out.println();

        do {
            attemptCount++;
            System.out.println("Attempt #" + attemptCount);
            System.out.println("-------------------");
            
            System.out.print("Enter Student Number: ");
            enteredNumber = input.nextInt();
            input.nextLine(); 

            System.out.print("Enter Password: ");
            enteredPassword = input.nextLine();
          
            if (enteredNumber == correctStudentNumber && enteredPassword.equals(correctPassword)) {
                isAuthenticated = true;
                System.out.println("✓ Credentials accepted!");
            } else {
                System.out.println("✗ Incorrect student number or password.");
                System.out.println("Please try again.\n");
            }

        } while (!isAuthenticated); 
        System.out.println("\n" + "=".repeat(40));
        System.out.println("🎉 ACCESS GRANTED! 🎉");
        System.out.println("Welcome, Student " + enteredNumber);
        System.out.println("Total attempts: " + attemptCount);
        System.out.println("=".repeat(40));
        
        input.close();
    }
}
