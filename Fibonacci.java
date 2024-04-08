public class Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("First " + n + " Fibonacci numbers:");
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
