package JavaGj;

import java.util.Scanner;

public class chap03Q01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("나이를 입력하세요: ");
		int Age = input.nextInt();
		
		
		if (Age >= 19) {
			System.out.println("성년");
		}
		else if (Age <= 19) {
			System.out.println("미성년");
		}
	}
}