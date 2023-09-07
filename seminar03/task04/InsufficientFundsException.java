package gb_exceptions.seminar03.task04;

public class InsufficientFundsException extends Exception{
    InsufficientFundsException(String message){
        super(message);
    }
}
