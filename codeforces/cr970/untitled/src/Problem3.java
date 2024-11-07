import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        while (n-->0){
            String line = scanner.nextLine();
            String[] words = line.split(" ");
            long l = Long.parseLong(words[0]);
            long r = Long.parseLong(words[1]);
            long c = 1;
            long a = l;
            while (a <= r){
                a += c;
                ++c;
            }
            System.out.println(--c);

        }
    }
}
