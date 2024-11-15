import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();

        while (t-- > 0) {
            long n = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();

            if (c >= n) {
                System.out.println(n);
            }
            else if (b == 0) {
                if (c < n - 2) {
                    System.out.println(-1);
                } else {
                    System.out.println(n - 1);
                }
            }
            else {
                long moves = (n - c + b - 1) / b;
                System.out.println(n - moves);
            }
        }
    }
}
