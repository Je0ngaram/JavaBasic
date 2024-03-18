package loop;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int i = 1;
		
		do {
			
			System.out.println(i);
			
			i++;
		} while (i <= 5);

	}

}
