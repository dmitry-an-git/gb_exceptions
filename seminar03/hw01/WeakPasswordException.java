package gb_exceptions.seminar03.hw01;

public class WeakPasswordException extends Exception{
    
    WeakPasswordException() {
        this("Пароль недостаточно надежен"); // дефолтный конструктор
    }
    WeakPasswordException(String message) {
        super(message);
    }
}
