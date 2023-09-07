package gb_exceptions.seminar02.hw03;

public class NumberSumException extends RuntimeException{
    
    public NumberSumException(){
        this("Сумма слишком мала"); // стандартное сообщение
    }
    public NumberSumException(String message){
        super(message);
    }


}

