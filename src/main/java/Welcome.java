import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String first = s.next();
        String second = s.next();
        String third = s.next();
        String fourth = s.next();

        int sumInput = intParser(first) + intParser(second) +
                intParser(third);
        System.out.println(sumInput + " " + fourth);
    }

    private static int intParser(String value) {
        return Integer.parseInt(value);
    }

}
