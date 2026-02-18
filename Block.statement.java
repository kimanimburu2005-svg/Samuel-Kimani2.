public class BlockStatement {
    public static void main(String[] args) {
        int studentNumber = 220237; 

        System.out.println("=====================================");
        System.out.println("BLOCK STATEMENT DEMONSTRATION");
        System.out.println("=====================================");
        System.out.println("Student: Samuel Kimani");
        System.out.println("Student Number (declared outside block): " + studentNumber);
        System.out.println();

        {
            System.out.println("--- ENTERING THE BLOCK ---");
            
            int blockVariable = 50;
            int sum = studentNumber + blockVariable; 
            
            System.out.println("Block variable (declared inside block): " + blockVariable);
            System.out.println("Sum of Student Number (" + studentNumber + ") + Block Variable (" + blockVariable + ") = " + sum);
            System.out.println("--- EXITING THE BLOCK ---");
        }

        System.out.println();
        System.out.println("--- OUTSIDE THE BLOCK ---");
        System.out.println("Student Number is still accessible: " + studentNumber);
        System.out.println("Attempting to access blockVariable here would cause a compilation error!");
        
        
        System.out.println("=====================================");
        System.out.println("Program finished. Variable scope demonstrated successfully.");
    }
}
