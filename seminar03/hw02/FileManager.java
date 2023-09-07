package gb_exceptions.seminar03.hw02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    /**
     * метод для записи строки данных в файл
     */
    public void writeFile(String path, String content) throws FileWriterException{
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(content);
        } catch (IOException e) {
            throw new FileWriterException("Ошибка записи в файл");
        }
    }

    /**
     * метод для копирования файла
     * принимает пути источника и назначения
     * выбрасывает ошибки в случае несуществующего источника, невозможности его прочтения и
     * невозможности записи копии
     */
    public void copyFile(String sourcePath, String destinationPath) throws FileNotCopiedException {
        String content;

        try {
            content = readFile(sourcePath);
        } catch (FileNotFoundException e) {
            throw new FileNotCopiedException("Файл-источник: " + e.getMessage());
        }

        try {
            writeFile(destinationPath, content);
        } catch (FileWriterException e) {
            throw new FileNotCopiedException(e.getMessage());
        } 

    }

    /**
     * метод для чтения файла, возвращает строку с содержимым файла
     * выбрасывает два типа ошибок 
     * первый - если файл не существует
     * второй - если его не удается прочитать 
     */

    public String readFile(String path) throws FileNotFoundException {
        String content = ""; // строка в которую будем записывать содержимое файла
       
        File file = new File(path); 
        if (!file.exists()) { // проверяем что файл есть
            throw new FileNotFoundException("Файл не найден"); 
        } 

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                String line; // построчно считываем файл и дописываем в content
                while ((line = reader.readLine()) != null) {
                    content += line + "\n";
                }
            } catch (IOException e) {
                throw new FileNotFoundException("Ошибка доступа к файлу");
            }
        return content;
    }

}
