package day9;

import java.util.Scanner;

public class Gender {
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("성명과 주민등록번호를 입력해 주세요");
		String name = scanner.next();
		String num = scanner.next();
		char ch = num.charAt(7);
		String result = ""; 
		
		switch(ch) {
		case '1' : result = "남" ;break;
		case '2' : result = "여" ;break;
		case '3' : result = "남" ;break;
		case '4' : result = "여" ;break;
		case '5' : result = "외국인" ;break;
		case '6' : result = "외국인" ;break;
		default : result = "다시 입력하여주세요";
		break;
		}
		System.out.printf("성명:%s\n성별\n:%s",name,result);
	}
	
}


