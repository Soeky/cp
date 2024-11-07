import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        while (n-->0){
            String line = scanner.nextLine();
            String[] words = line.split(" ");
            int ones = Integer.parseInt(words[0]);
            int twos = Integer.parseInt(words[1]);
            boolean onesDiv2 = ones % 2 == 0;
            boolean twosDiv2 = twos % 2 == 0;
            if(ones == 0 && !twosDiv2 || twos == 0 && !onesDiv2 || !onesDiv2 && twosDiv2 || !onesDiv2 && !twosDiv2) {
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
        }
    }



}
