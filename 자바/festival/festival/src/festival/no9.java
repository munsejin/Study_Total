package festival;

import java.util.Scanner;

public class no9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자a>> ");
		String number = sc.next();
		System.out.println("얼마나 ? >> ");
		
		int how = sc.nextInt();
		
		System.out.println(ceasar(number,how));

	}
	public static String ceasar(String number,int how) {
		
		String Password;
		number += how;
		Password = number;
		
		return Password;
	}
}
