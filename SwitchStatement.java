import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====================================");
        System.out.println("SWITCH STATEMENT DEMONSTRATION");
        System.out.println("=====================================");
        System.out.println("Student: Samuel Kimani");
        System.out.println();

        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = input.nextInt();

        String dayName;
        System.out.println();

        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid input! Please enter a number between 1 and 7.";
                break;
        }

        System.out.println("Day " + dayNumber + ": " + dayName);
        System.out.println("\n=====================================");
        input.close();
    }
}
