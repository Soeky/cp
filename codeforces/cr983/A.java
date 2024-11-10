import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        while (n-->0){
            int lights = scanner.nextInt();
            scanner.nextLine();
            int[] states = new int[2*lights];
            int countOnes = 0;
            int countZeros = 0;
            for (int i = 0; i<states.length; i++){
                int curr = scanner.nextInt();
                if (curr == 0){
                    countZeros++;
                }else {
                    countOnes++;
                }
            }
            int min = countOnes %2 ==0 ? 0:1;
            int max = Math.min(countOnes, countZeros);
            System.out.println(min+" "+max);

        }
    }

}
