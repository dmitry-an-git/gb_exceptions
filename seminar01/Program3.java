package gb_exceptions.seminar01;
public class Program3 {
    public static void main(String[] args) {
        try {
            int nominator = 10;
            int denominator = 0;

            if (denominator == 0) {
                throw new ArithmeticException("division by zero");
            }

            int result = nominator / denominator;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
            System.out.println(e); // java.lang.ArithmeticException: division by zero
            e.printStackTrace(); // строки 
        }
    }
}
