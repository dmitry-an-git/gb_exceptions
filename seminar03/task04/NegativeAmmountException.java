package gb_exceptions.seminar03.task04;

public class NegativeAmmountException extends RuntimeException{
    NegativeAmmountException(String message){
        super(message);
    }
}
