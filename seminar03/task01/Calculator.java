package gb_exceptions.seminar03.task01;

public class Calculator {

    public double add(double a, double b) throws ArithmeticException{
        return a + b;
    }

    public double substract(double a, double b) throws ArithmeticException{
        return a - b;
    }

    public double multiply(double a, double b) throws ArithmeticException{
        return a * b;
    }

    public double divide(double a, double b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("Нельзя делить на ноль");
        }
        return a / b;
    }

}
