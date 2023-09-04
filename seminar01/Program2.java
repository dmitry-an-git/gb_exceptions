package seminar01;

public class Program2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 8, 16, 32, 64};
        int[] arr2 = {3, 0, 4, 4, 0, 4};

        for (int index = 0; index < arr1.length; index++) {
            try {
                System.out.println(arr1[index] + " / " + arr2[index] + " = " + arr1[index]/arr2[index]);
            } catch (ArithmeticException e) {
                System.out.println("division by zero");
            } catch (ArrayIndexOutOfBoundsException ai) {
                System.out.println("Out of bounds");
            }
        }

    }
}
