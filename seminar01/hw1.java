package seminar01;

public class hw1 {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }

}

class Answer {
        public static void arrayOutOfBoundsException() {
            int[] arr = {0,1,2,4,8,16,32};
            int array = arr[10];
        
        }

        public static void divisionByZero() {
            int a = 10;
            int b = 0;
            int c = a / b;
        }

        public static void numberFormatException() {
            String string = "aaa";
            int result = Integer.parseInt(string);
        
        }
    }
