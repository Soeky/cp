import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        while (n-->0){
            int sl = scanner.nextInt();
            scanner.nextLine();
            boolean isSquare = (int) Math.sqrt(sl) * (int) Math.sqrt(sl) == sl;
            if(!isSquare){
                scanner.nextLine();
                System.out.println("No");
                continue;
            }
            char[] s = scanner.nextLine().toCharArray();

            long sum = 0;
            for (int j = 0; j < sl; j++){
                sum += Integer.parseInt(s[j]+"");
            }
            int side = (int) Math.sqrt(sl);
            if (sum != side*4 - 4){
                System.out.println("No");
                continue;
            }
            System.out.println("Yes");
        }
    }





}
