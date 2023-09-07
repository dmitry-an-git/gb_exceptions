package gb_exceptions.seminar02.hw02;

import java.util.Scanner;

/*
 * Задача 2:
 * Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. 
 * Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException 
 * с сообщением "Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.
 */

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.printf("Введите второе число: ");
        int num2 = sc.nextInt();
        try {
            if (num2 == 0) {
                throw new DivisionByZeroException();
            } else {
                float result = (float) num1 / num2;
                System.out.printf("Результат деления: %.2f\n", result);
            }
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
