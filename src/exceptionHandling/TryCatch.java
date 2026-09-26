package exceptionHandling;

public class TryCatch {
    public static void main(String[] args) {

        try {
            // Code that may cause an exception
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println(result);
        }
        catch (ArithmeticException e) {
            // Handles division by zero
            System.out.println("Cannot divide by zero");
        }

        // Program continues after exception is handled
        System.out.println("Program continues...");
    }


}
