package exceptionHandling;

public class MultipleExceptions {
    public static void main(String[] args) {

        try {
            // Trying to access an invalid array index
            int[] arr = {10, 20, 30};

            int value = arr[5];

            // This line won't execute because exception occurred above
            int result = 10 / 0;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            // Handles invalid array index
            System.out.println("Invalid array index");
        }
        catch (ArithmeticException e) {
            // Handles division by zero
            System.out.println("Cannot divide by zero");
        }
        catch (Exception e) {
            // Handles other unexpected exceptions
            System.out.println("Some other exception occurred");
        }
    }
}
