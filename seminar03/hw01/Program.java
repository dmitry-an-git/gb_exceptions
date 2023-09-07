package gb_exceptions.seminar03.hw01;

import java.util.Scanner;

/*
 * Задача 1: Проверка пароля (Основы языка Java, операторы, ветвления)
 * 
 * Создайте класс PasswordVerifier. Этот класс должен содержать метод, который принимает 
 * строку пароля и проверяет его на соответствие следующим правилам:
 * 
 * Пароль должен быть не менее 8 символов.
 * Пароль должен содержать хотя бы одну цифру.
 * Пароль должен содержать хотя бы одну заглавную букву.
 * Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.
 */

public class Program {
    public static void main(String[] args) {
        System.out.printf("Введите пароль для проверки надежности: ");

        try(Scanner sc = new Scanner(System.in)) { // try with resources (lecture 3)
            String password = sc.nextLine();
            PasswordVerifier pv = new PasswordVerifier(); // наш класс для проверки
            pv.checkPassword(password); // соответственно метод, выбрасывающий исключения
            System.out.println("Пароль надежен!"); // не доходим до сюда, если что-то не так
        } catch (WeakPasswordException e) {
            System.out.println("Ошибка: "+e.getMessage()); // выводим информацию об ошибке
        }
    }
}
