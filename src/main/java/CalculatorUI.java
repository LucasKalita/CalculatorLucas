import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CalculatorUI extends CalculatorSystem {
    Scanner scanner = new Scanner(System.in);
    public void calculator() {
        boolean isRunning = true;
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        welcomeMessage();

        do {
            chooseYourOptionMessage();
            System.out.print("Please choose your option: ");
            int input = scanner.nextInt();
            if(myList.contains(input)) {
                switch (input) {
                    case 1 -> additionMessage();
                    case 2 -> subtractionMessage();
                    case 3 -> multiplyMessage();
                    case 4 -> divisionMessage();
                }
            }else {
                System.out.println("Unknown input");
            }
            System.out.println("Do you want to Continue? 1 - Yes; Everything else - No");
            int d = scanner.nextInt();
            if (d == 2){
                System.out.println("Copy, turning off calculator");
                isRunning = false;}
        }while (isRunning);

    }
}