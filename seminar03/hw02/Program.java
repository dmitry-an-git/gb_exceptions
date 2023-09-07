package gb_exceptions.seminar03.hw02;

/* Задача 2: Файловый менеджер (ООП, исключения)

 * Создайте класс FileManager. Этот класс должен иметь методы для 
 * выполнения основных операций с файлами: чтение, запись и копирование. 
 * Каждый из этих методов должен выбрасывать соответствующее исключение, 
 * если в процессе выполнения операции произошла ошибка (например, FileNotFoundException, 
 * если файл не найден).
 */

public class Program {
    public static void main(String[] args) throws java.io.FileNotFoundException {
        FileManager fm = new FileManager();

        try { // записываем в файл строку с текстом
            fm.writeFile("test1.txt", "some content\nда");
            System.out.println("Запись в файл завершена успешно");
        } catch (FileWriterException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } 

        try { // блок проверки копирования файла
            fm.copyFile("test1.txt", "test2.txt");
        } catch (FileNotCopiedException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try { // блок проверки чтения файла
            String content = fm.readFile("test2.txt");
            System.out.println("Содержимое файла:");
            System.out.println(content);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } 
    }

}
