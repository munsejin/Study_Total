package festival;

import java.util.Scanner;

public class no1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("총금액 입력 >> ");
		int money = sc.nextInt();
		
		int m1 = money/10000;
		int m2 = (money%10000)/5000;
		int m3 = (money%5000)/1000;
		int m4 = (money%1000)/500;
		int m5 = (money%500)/100;
		
		System.out.println("잔돈 >> " + money);
		System.out.println("10000원" + m1 +"개");
		System.out.println("5000원" + m2 +"개");
		System.out.println("1000원" + m3 +"개");
		System.out.println("500원" + m4 +"개");
		System.out.println("100원" + m5 +"개");
		
		
	}
}
