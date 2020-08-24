package festival;

import java.util.Scanner;

public class no5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 >> ");
		int number = sc.nextInt();

		System.out.print(isHarshad(number));
	}

	public static boolean isHarshad(int number) {

		int a = number / 10;
		int b = number % 10;

		if (number % (a + b) == 0) {
			return true;
		} else {
			return false;
		}

	}
}
