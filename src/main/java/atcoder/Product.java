package atcoder;

import java.util.Scanner;
import java.util.stream.Stream;

public class Product {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int answer = Stream.of(s.next(), s.next())
				.map(Integer::parseInt)
				.filter(n -> n % 2 == 0)
				.findFirst().orElse(-1);
		if (answer == -1) {
			System.out.println("Odd");
		} else {
			System.out.println("Even");
		}
	}
}
