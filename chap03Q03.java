package JavaGj;

import java.util.Scanner;

public class chap03Q03 {

	public static void main(String[] args) {
		System.out.println("양의 정수를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum = 0;
		sum += num;
		
		do {
			if(num > 0) 
				System.out.println("양의 정수를 입력하세요 : ");
			}while (num < 0);
		
		System.out.println("입력한 양의 정수 중에서 짝수의 합은" + sum);
		} 
	}