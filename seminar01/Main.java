package seminar01;

public class Main {
    public static void main(String[] args) {
    
        int[] arr = new int[10];
        try {
            System.out.println("before exception");
            arr[11]=10;
            System.out.println("after exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index is out of bound");
            // TODO: handle exception
        }
        System.out.println("after the catch");

    }   
}