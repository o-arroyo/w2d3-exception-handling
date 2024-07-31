package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {
    public static int[] getUserInput() {
        int[] usersNumbers = new int[2];
        Scanner scanner = new Scanner(System.in);
        String divisorMessage = "Enter divisor: ";
        String dividendMessage = "Enter dividend: ";

        int divisor = enterNumber(scanner, divisorMessage);
        int dividend = enterNumber(scanner, dividendMessage);

        usersNumbers[0] = divisor;
        usersNumbers[1] = dividend;

        return usersNumbers;
    }

    private static int enterNumber(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            if(scanner.hasNextInt()) return scanner.nextInt();
            else {
                System.out.println("Invalid input. Please try again.");
                scanner.next();
            }
        }
    }
}
