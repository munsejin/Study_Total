package festival;

import java.util.Scanner;

public class no1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ѱݾ� �Է� >> ");
		int money = sc.nextInt();
		
		int m1 = money/10000;
		int m2 = (money%10000)/5000;
		int m3 = (money%5000)/1000;
		int m4 = (money%1000)/500;
		int m5 = (money%500)/100;
		
		System.out.println("�ܵ� >> " + money);
		System.out.println("10000��" + m1 +"��");
		System.out.println("5000��" + m2 +"��");
		System.out.println("1000��" + m3 +"��");
		System.out.println("500��" + m4 +"��");
		System.out.println("100��" + m5 +"��");
		
		
	}
}
