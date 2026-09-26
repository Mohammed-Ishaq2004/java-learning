package exceptionHandling;

// Demonstrates the difference between throw and throws

class AgeException extends Exception {

    AgeException(String message) {
        super(message);
    }
}

public class ThrowAndThrowsInJava {

    // 'throws' declares that this method may throw AgeException
    static void checkAge(int age) throws AgeException {

        if (age < 18) {
            // 'throw' actually throws the exception
            throw new AgeException("Age must be 18 or above");
        }

        System.out.println("You are eligible.");
    }

    public static void main(String[] args) {

        try {
            // Calling a method that may throw AgeException
            checkAge(16);
        }
        catch (AgeException e) {
            // Handling the exception
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
