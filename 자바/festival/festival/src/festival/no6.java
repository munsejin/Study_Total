package festival;

import java.util.Scanner;

public class no6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 >> ");
		int number = sc.nextInt();
		System.out.println(collatzNumber(number));

	}

	public static int collatzNumber(int number) {
		int count = 0;
		while (true) {
			if (number % 2 == 0) {
				count++;
				number /= 2;
			}
			else {
				count++;
				number *= 3;
				number += 1;
			}
			if (number == 1) {
				break;
			}
			if (count >= 500) {
				count = -1;
				break;
			}
		}
		return count;
	}
}
