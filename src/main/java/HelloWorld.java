/**
 * Project Name    : sonarqube-example
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 8/8/2019
 * Time            : 4:28 PM
 * Description     : Sample class for SonarQube and Unit Testing
 **/

public class HelloWorld {

    public void sayHello() {
        System.out.println("Hello World!");
    }

    public void notCovered() {
        System.out.println("This method is not covered by unit tests");
    }

    // Returns greeting message
    public String getGreeting(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello Guest";
        }
        return "Hello " + name;
    }

    // Adds two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Checks even number
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Simple division with validation
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }
}
