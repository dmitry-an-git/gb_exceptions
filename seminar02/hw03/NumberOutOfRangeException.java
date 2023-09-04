package seminar02.hw03;

public class NumberOutOfRangeException extends RuntimeException{
    
    public NumberOutOfRangeException(){
        this("Число вне допустимого диапазона"); // стандартное сообщение
    }
    public NumberOutOfRangeException(String message){
        super(message);
    }


}
