package Gerenlianxi;

import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		
		String[] result = {};
		String[]vivace = {"은지","서우","지우","창준","현일"};
		String[]royal = {"창하","정욱","은영","수호"};
		String[]atlas= {"준영","준수","은지","윤영"};
		String[]nm = {"정우","오윤","수지","티파니"};
		
		System.out.println("팀명을 입력하시면 팀조장을 알려드립니다.");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		
		switch(name) {
		case"vivace" : result =vivace ;break;
		case"royal" : result =royal ;break;
		case"atlas" : result =atlas ;break;
		case"nm" : result = nm;break;
		default : System.out.println("입력값이 잘못되었습니다.");
			break;
			
			}
		for(int i=0;i<vivace.length;i++) {
			System.out.println(result[i]);
		
			}
	
		}

		
	}

