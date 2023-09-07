package gb_exceptions.seminar01;

import java.util.InputMismatchException;
import java.util.Scanner; 

public class Program4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.printf("Please enter the first digit: ");
                String first = sc.nextLine();
                System.out.printf("Please enter the second digit: ");
                String second = sc.nextLine();

                int firstInt = Integer.parseInt(first);
                int secondInt = Integer.parseInt(second);
                int result = firstInt / secondInt;
                System.out.println("The result of division is: " + result);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Can't divide by zero");
            } catch (InputMismatchException e) {
                System.out.println("Wrong input, try again");
            }
        }
    }
}
