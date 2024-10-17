import java.util.Scanner;

public class FibonacciCheck {
    public static boolean isFibonacci(int n) {
        int a = 0, b = 1;
        if (n == 0 || n == 1)
            return true;
        int next = a + b;
        while (next <= n) {
            if (next == n)
                return true;
            a = b;
            b = next;
            next = a + b;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int number = scanner.nextInt();
        if (isFibonacci(number)) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }
        scanner.close();
    }
}
