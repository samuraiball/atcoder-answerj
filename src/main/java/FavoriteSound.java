import java.util.Scanner;

public class FavoriteSound {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = Integer.parseInt(s.next());
        int b = Integer.parseInt(s.next());
        int c = Integer.parseInt(s.next());
        int an = b / a;
        System.out.println(an < c ? an : c);
    }
}
