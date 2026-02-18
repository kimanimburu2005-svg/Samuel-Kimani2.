import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====================================");
        System.out.println("IF-ELSE STATEMENT DEMONSTRATION");
        System.out.println("=====================================");
        System.out.println("Student: Samuel Kimani");
        System.out.println();

        System.out.print("Enter your height in feet (e.g., 5.8 for 5 feet 8 inches): ");
        double height = input.nextDouble();

        System.out.println("\n--- Height Classification Result ---");
        System.out.print("Height " + height + " feet: ");

        if (height >= 6.0) {
            System.out.println("Tall");
        } else if (height > 5.58) { // 5'7" is approximately 5.58333... feet (7/12 = 0.5833)
            System.out.println("Average");
        } else {
            System.out.println("Short");
        }
        
        System.out.println("\n=====================================");
        input.close();
    }
}
