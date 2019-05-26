import java.util.Scanner;

public class Buttons {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = Integer.parseInt(s.next());
        int b = Integer.parseInt(s.next());

        int coins = 0;
        for (int i = 0; i < 2; i++) {
            if (a < b) {
                coins += b;
                b--;
            } else{
                coins += a;
                a--;
            }
        }
        System.out.println(coins);
    }
}
