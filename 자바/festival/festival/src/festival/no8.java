package festival;

public class no8 {

	public static void main(String[] args) {

		int arr[][] = new int[5][5];

		System.out.println(" ���� >> ");
		int cnt = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = cnt++;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(" ");
		}
		
		
		
		System.out.println(" 180�� ");

		int cnt1 =1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				arr[i][j] = cnt1++;
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println(" ");
		}

	}

}
