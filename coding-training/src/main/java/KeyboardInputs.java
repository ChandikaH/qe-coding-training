import java.io.IOException;
import java.util.Scanner;

/**
 * @author chandikah
 * on 2022-03-23
 */
public class KeyboardInputs {
    public static void main(String[] args) {
        sumOfNumbers();
    }

    public static void sumOfNumbers() {
        try {
            int firstNum, secondNum;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 1st Number = ");
            firstNum = scanner.nextInt();
            System.out.println("Enter 2nd Number = ");
            secondNum = scanner.nextInt();

            int sum = firstNum + secondNum;
            System.out.println("Sum of two numbers " + firstNum + " AND " + secondNum + " = " + sum);
        } catch (Exception ex) {
            System.out.println("Exception occured");
            ex.printStackTrace();
        }

    }
}
