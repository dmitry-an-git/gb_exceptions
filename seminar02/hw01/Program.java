package seminar02.hw01;

import java.util.Scanner;

/*
Задача 1: Напишите программу, которая запрашивает у пользователя число и проверяет, 
является ли оно положительным. Если число отрицательное или равно нулю, программа 
должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число". 
В противном случае, программа должна выводить сообщение "Число корректно".
*/


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int number = sc.nextInt();
        try {
            if (number <= 0) {
                throw new InvalidNumberException();
            } else {
                 System.out.println("Число корректно");
            }
        } catch (InvalidNumberException e) {
            //System.out.println(e.getMessage()); 
            System.out.println(e); // тут в соответствии с условием не само сообщение, а вся ошибка
        }
    }
}
