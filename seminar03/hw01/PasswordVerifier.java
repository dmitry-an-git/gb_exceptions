package gb_exceptions.seminar03.hw01;

public class PasswordVerifier {
    
    /*
     * метод-агрегатор, запускаем три приватных метода и ждем сообщение об ошибке (и оправляем его наверх)
     */
    void checkPassword(String password) throws WeakPasswordException{
        
        checkPasswordSize(password);
        checkPasswordDigits(password);
        checkPasswordCapitals(password);
        
    }

    /* 
     * проверяет длину пароля
     */
    private void checkPasswordSize(String password) throws WeakPasswordException{
        if (password.length()<8) {
            throw new WeakPasswordException("Пароль слишком короткий (менее 8 символов)");
        }
    }

    /* 
     * проверяет наличие цифр
     */
    private void checkPasswordDigits(String password) throws WeakPasswordException{
        boolean containsDigit = false;
    
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                containsDigit = true;
                break;
            }
        }
        if (!containsDigit) {
            throw new WeakPasswordException("В пароле нет ни одной цифры");
        }
    }

    /* 
     * проверяет наличие заглавных букв
     */
    private void checkPasswordCapitals(String password) throws WeakPasswordException{
        boolean containsCapital = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                containsCapital = true;
                break;
            }
        }
        if (!containsCapital) {
            throw new WeakPasswordException("В пароле нет ни одной заглавной буквы");
        }
    }
}
