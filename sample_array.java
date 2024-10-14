//Program to add numbers in array using for-loop

import java.util.Scanner;
public class sample_array {

	public static void main(String[ ] args) {
		int [ ] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		
		arr[0] = scan.nextInt();
		arr[1] = scan.nextInt();
		arr[2] = scan.nextInt();
		arr[3] = scan.nextInt();
		arr[4] = scan.nextInt();
		int result = 0;
		for(int i=0; i< arr.length;i++) {
			result = arr[i] + result;
		}
		System.out.println(result);
}
}