package sequence;
import java.util.Scanner;

public class sequence01 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println(" 변수 a에 넣을 숫자 입력 : " + 10);
		System.out.println(" 변수 b에 넣을 숫자 입력 : " + 25);
		System.out.println("\t");
		System.out.println(" Swapping 결과 > ");
		
		int a = 10;
		int b = 25;
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println(" 변수 a의 값 = " + a);
		System.out.println(" 변수 b의 값 = " + b);
		

	}

}
