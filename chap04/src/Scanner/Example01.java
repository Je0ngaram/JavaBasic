package Scanner;

public class Example01 {
	
	public static void main (String[] args) {
		String compileLang = "Java"; 
		String scriptLang = "JavaScript";

		System.out.println("나는 전가람입니다");
		System.out.println(compileLang + " Program");
		System.out.println(scriptLang + " Program");
		System.out.println("하루는 " + 24 * 60 + "분 입니다.");
		System.out.println();

		String program = "Program";
		System.out.println(compileLang + " " + program);
		System.out.println(scriptLang + " " + program);
		System.out.println();

		int a = 10;
		int b = 15;
		System.out.println(a + " + " + b + " = " + a + b);
		System.out.println(a + " + " + b + " = " + (a + b));
		}
	}