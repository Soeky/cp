import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-->0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            scanner.nextLine();
            if (n==1){
                System.out.println("1\n1");
                continue;
            }
            if (k==1 || k==n){
                System.out.println("-1");
                continue;
            }
            int p2 = k - k%2;
            int p3 = k+1+k%2;
            System.out.println("3\n1 "+ p2 + " " + p3);
        }
    }
}
