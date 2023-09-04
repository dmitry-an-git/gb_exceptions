package seminar02.hw02;

public class DivisionByZeroException extends RuntimeException {
    
    public DivisionByZeroException(){
        this("Деление на ноль недопустимо"); // стандартное сообщение
    }
    public DivisionByZeroException(String message){
        super(message);
    }

}
