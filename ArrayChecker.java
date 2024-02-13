public class ArrayChecker {
    public static boolean containsZeroOrNegativeOne(int[] arr) {
        for (int num : arr) {
            if (num == 0 || num == -1) {
                return true;
            }
        }
        return false;
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int[] array1 = {100, 521, -76, -12, 174}; 
        int[] array2 = {0, 10, 15}; 
        
        System.out.println("Array 1 contains 0 or -1: " + containsZeroOrNegativeOne(array1));
        System.out.println("Array 2 contains 0 or -1: " + containsZeroOrNegativeOne(array2));
        int n = 10; 
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
    }
}
