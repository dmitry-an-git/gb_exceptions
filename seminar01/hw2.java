package gb_exceptions.seminar01;

public class hw2 {
    
    public static void main(String[] args) {
        int[] a = {6,7,8};
        int[] b = {4,5,6,5};
        printArray(a);
        printArray(b);
        int[] c = subArrays(a,b);
        printArray(c);
        
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
    static int[] subArrays(int[] a, int[] b){
        if (a.length != b.length) {
            int[] nores = {0};
            return nores;
        } else {
            int length = a.length;
            int[] arr = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = a[i] - b[i];
            }
            return arr;
        }
      
         
      }

}
