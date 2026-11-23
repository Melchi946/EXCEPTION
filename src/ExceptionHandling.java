import java.util.Scanner;
public class ExceptionHandling {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            try {
                // Ask the user to enter two numbers
                System.out.print("Enter the first number: ");
                int num1 = input.nextInt();

                System.out.print("Enter the second number: ");
                int num2 = input.nextInt();

                // Perform division
                int result = num1 / num2;

                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {

                // Handle division by zero
                System.out.println("Error: Cannot divide by zero!");

            } catch (Exception e) {

                // Handle other errors
                System.out.println("Invalid input! Please enter numbers.");

            } finally {

                // This block always executes
                System.out.println("Program execution completed.");
                input.close();
            }
        }
    }

