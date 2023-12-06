import java.util.Scanner;

public class CalculatorSystem {
    Scanner scanner = new Scanner(System.in);

    public void additionMessage() {
        System.out.print("Please enter numbers to add. Number 1: ");
        double x = scanner.nextDouble();
        System.out.print("Second number: ");
        double y = scanner.nextDouble();
        System.out.println("Result: " + addition(x, y));

    }

    public void subtractionMessage() {
        System.out.print("Please enter numbers to Subtract");
        System.out.println("Number to subtract from");
        double x = scanner.nextDouble();
        System.out.print("Subtracted number: ");
        double y = scanner.nextDouble();
        System.out.println("Result: " + subtraction(x, y));

    }

    public void multiplyMessage() {
        System.out.print("Please enter numbers to multiply. Number 1: ");
        double x = scanner.nextDouble();
        System.out.print("Second number: ");
        double y = scanner.nextDouble();
        System.out.println("Result: " + multiplication(x, y));

    }

    public void divisionMessage() {
        System.out.println("Please enter numbers to divide. Remember not to divide by 0 ");
        System.out.print("Enter the number you want to divide: ");
        double x = scanner.nextDouble();

        System.out.print("Second number, remember it should not be 0: ");
        double y = scanner.nextDouble();

        if (y == 0) {
            System.out.println("The number you've entered is 0");
            System.out.println("The universe could blow up");
            System.out.println("Please rethink your strategy and try again");
            do {
                System.out.println("Enter the number again: ");
                y = scanner.nextInt();
            } while (y == 0);
        } else {
            System.out.println("result: " + division(x, y));
        }
    }

    private double addition(double x, double y) {
        return x + y;
    }

    private double subtraction(double x, double y) {
        return x - y;
    }

    private double multiplication(double x, double y) {
        return x * y;
    }

    private double division(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public void chooseYourOptionMessage() {
        System.out.println("Press 1 to add");
        System.out.println("Press 2 to subtract");
        System.out.println("Press 3 to multiply");
        System.out.println("Press 4 to divide");
    }

    public void welcomeMessage() {
        System.out.println("Welcome! this is your simple calculator");
        System.out.println("I'm still under construction");
        System.out.println("Therefore i only have 4 options and work only by reading numbers");
        System.out.println("Also it's only possible to operate on two numbers at once");
        System.out.println("Remember! You you are using polish number system");
        System.out.println("You can type incomplete numbers only using DECIMAL instead of POINT");
        System.out.println("Thank you for your cooperation");
    }
}

