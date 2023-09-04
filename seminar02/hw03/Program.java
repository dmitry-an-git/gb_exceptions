package seminar02.hw03;

/* 
 * Задача3: - по желанию
Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:

Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением 
"Первое число вне допустимого диапазона".

Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением 
"Второе число вне допустимого диапазона".

Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением 
"Сумма первого и второго чисел слишком мала".

Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением 
"Деление на ноль недопустимо".

В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
- необходимо создать 3 класса собвстенных исключений
 */

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.printf("Введите второе число: ");
        int num2 = sc.nextInt();
        System.out.printf("Введите третье число: ");
        int num3 = sc.nextInt();
        
        try {
            if (num1 > 100) {
                throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
            } else if (num2 < 0) {
                throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
            } else if (num1+num2 < 10) {
                throw new NumberSumException("Сумма первого и второго чисел слишком мала");
            } else if (num3 == 0) {
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            } else {
                System.out.println("Проверка пройдена успешно");
            }
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }
    
}
