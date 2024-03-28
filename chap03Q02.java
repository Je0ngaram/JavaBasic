package JavaGj;

import java.util.Scanner;

public class chap03Q02 {

	public static void main(String[] args) {
		System.out.println("등수를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		String score = input.next();
		
		switch (score) {
		  case "1":
			  System.out.println("아주 잘했습니다");
			  break;
		  case "2":
			  System.out.println("잘했습니다");
			  break;
		  case "3":
			  System.out.println("잘했습니다");
			  break;
		  case "4":
			  System.out.println("보통입니다");
			  break;
		  case "5":
			  System.out.println("보통입니다");
			  break;
		  case "6":
			  System.out.println("보통입니다");
			  break;
		  default:
			  System.out.println("노력해야겠습니다");
		}
	}
}