package exceptionHandling;

public class Finally_Demo {
    public static void main(String[] args) {
        int a = 20, b = 5, c = 5, result;
        try {
            result = a / (b - c);
            System.out.println("result" + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Exception caught:Division by zero");
        }

        finally {
            System.out.println("Finally block will print everytime just after try and catch");
        }
    }
}
