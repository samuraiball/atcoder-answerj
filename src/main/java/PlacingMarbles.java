import java.util.Scanner;

public class PlacingMarbles {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] c = s.next().toCharArray();
		int sum = 0;
		for (char ch : c) {
			sum += Character.getNumericValue(ch);
		}
		System.out.println(sum);
	}
}
