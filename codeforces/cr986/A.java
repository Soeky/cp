import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    scanner.nextLine();

    while (n-- > 0) {
        int length = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();
        String dir = scanner.nextLine();
        int x = 0;
        int y = 0;
        int encounter = 0;
        A: while (encounter < 100) {
            for (int i = 0; i < length; i++) {
                switch (dir.charAt(i)) {
                    case 'N': {
                        y++;
                        break;
                    }
                    case 'E': {
                        x++;
                        break;
                    }
                    case 'S': {
                        y--;
                        break;
                    }
                    case 'W': {
                        x--;
                        break;
                    }
                    default: {
                        break;
                    }
                }
                if (a==x && b==y){
                    System.out.println("YES");
                    break A;
                }
            }
            encounter++;
            if (encounter == 99){
                System.out.println("NO");
                break A;
            }
        }
    }
  }

}
