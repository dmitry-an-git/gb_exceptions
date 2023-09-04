package seminar02.hw01;

public class InvalidNumberException extends Exception{

    public InvalidNumberException(){
        this("Некорректное число"); // стандартное сообщение
    }
    public InvalidNumberException(String message){
        super(message);
    }
}
