package festival;

import java.util.Scanner;

public class no4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� >> ");
		int number = sc.nextInt();
		int sum = 1;
		for (int i = 0; i<number; i++) {
			sum += i;
			System.out.print(sum + " ");
	}
	}
}
