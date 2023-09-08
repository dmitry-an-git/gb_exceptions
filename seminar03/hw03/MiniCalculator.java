package gb_exceptions.seminar03.hw03;

import java.util.ArrayList;
import java.util.List;

public class MiniCalculator {
    
    private List<String> backLog; // тут храним историю операций
    private MathOperations mo; // сущность со спецификацией мат операций

    public MiniCalculator() {
        this.backLog = new ArrayList<String>();
        this.mo = new MathOperations();
    }

    /**
     * Метод для осуществления сложения (путем вызова mo.add())
     * Выводит в консоль строку с решенным примером и записывает ее в бэклог.
     * Исключений не обрабатывает
     */

    public void add(int a, int b) {
        int result = mo.add(a,b);
        String output = a + " + " + b + " = " + result;
        System.out.println(output);
        backLog.add(output);
    }

    /**
     * Метод для осуществления вычитания (аналогичен сложению, но через mo.substract())
     */
    public void substract(int a, int b) {
        int result = mo.subtract(a,b);
        String output = a + " - " + b + " = " + result;
        System.out.println(output);
        backLog.add(output);
    }

    /**
     * Метод для осуществления умножения (аналогичен сложению, но через mo.multiply())
     */
    public void multiply(int a, int b) {
        int result = mo.multiply(a,b);
        String output = a + " * " + b + " = " + result;
        System.out.println(output);
        backLog.add(output);
    }

    /**
     * Метод для осуществления деления (через mo.multiply())
     * Осуществляется проверка на наличие возможных исключений
     * В консоль и бэклог поступает либо решенный пример, либо сообщение об ошибке.
     */
    public void divide(double a, double b) {
        String output;
        try {
            double result = mo.divide(a,b);
            output = a + " / " + b + " = " + result;
        } catch (ArithmeticException e) {
            output = e.getMessage();
        }
        System.out.println(output);
        backLog.add(output);
    }

    /**
     * Метод для осуществления возведения в степень (через mo.power())
     * Аналогично делению.
     */
    public void power(int a, int b) {
        String output;
        try {
            double result = mo.power(a,b);
            output = a + " ^ " + b + " = " + result;
        } catch (ArithmeticException e) {
            output = e.getMessage();
        }
        System.out.println(output);
        backLog.add(output);
    }

    /**
     * Вывод в консоль истории операций
     */
    public void printBackLog() {
        for (String entry : backLog) {
            System.out.println(entry);
        }
    }

}
