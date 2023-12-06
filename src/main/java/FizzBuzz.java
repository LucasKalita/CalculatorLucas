import java.util.Objects;
import java.util.Scanner;

public class FizzBuzz {
    Scanner scanner = new Scanner(System.in);

    public void fizzBuzz() {
        Boolean fb = true;
        do{
            System.out.println("enter your number");
        int x = scanner.nextInt();
        if (x % 3 == 0 && x % 5 == 0) System.out.println("FizzBuzz");
        else if (x % 3 == 0) System.out.println("Fizz");
        else if (x % 5 == 0) System.out.println("Buzz");
        else System.out.println("Unknown input");

            System.out.println("Do you want to continue?: y / n");
            String input = scanner.next();
            String n = "n";
            if (Objects.equals(input, "n") || Objects.equals(input, "N")){fb = false;}
    }while (fb);
}}