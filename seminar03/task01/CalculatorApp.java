package gb_exceptions.seminar03.task01;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.printf("Введите первое число: ");
        double a = sc.nextDouble();

        System.out.printf("Введите операцию: ");
        String operation = sc.next();

        System.out.printf("Введите второе число: ");
        double b = sc.nextDouble();
        
        try {
            double result = 0;
            switch (operation) {
                case "+":
                    result = calculator.add(a,b);
                    break;
                case "-":
                    result = calculator.substract(a,b);
                    break;
                case "*":
                    result = calculator.multiply(a,b);
                    break; 
                case "/":
                    result = calculator.divide(a,b);
                    break;                                
                default:
                    throw new InvalidInputException("Неверная операция");
            }
            System.out.println("Результат: " + result);
        } catch (ArithmeticException | InvalidInputException e) {
            System.out.println("Ошибка: "+e.getMessage());
        }
    }
}
