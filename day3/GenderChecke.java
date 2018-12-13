package day3;

import java.util.Scanner;

public class GenderChecke {

	public void test() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름과 주민번호를 입력해주세요");
		String name = scanner.next();
		String snn = scanner.next();
		char ch = snn.charAt(7);
		String result = ""; 
		
		switch (ch) {
		
		case '1' : result = "남";break;
		case '2' : result = "여";break;
		case '3' : result = "남";break;
		case '4' : result = "여";break;
		case '5' : result = "외국인";break;
		case '6' : result = "외국인";break;
		default : result = "다시입력해주십시오";
		break;
		
		}		
		
		System.out.printf("이름 :%s\n성별 :%s\n",name,result);
		
	}
}
