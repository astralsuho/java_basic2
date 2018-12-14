package Gerenlianxi;

import java.util.Scanner;

public class MyClassB {

	public static void main(String[] args) {
		
		String[] res = {}; //배열을 특징
		String[] class1 = new String[20]; // 총인원
		String[] vivace = {"은지","서우","지우","창준","현일"};
		String[] royal = {"창하","정욱","은영","수호"};
		String[] atlas= {"준영","준수","은지","윤영"};
		String[] nm = {"정우","오윤","수지","티파니"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("팀을 입력해주세요");
		String name = scanner.next();
		
		switch(name) {
		case"vivace" : res = vivace; break;
		case"royal"  : res = royal  ;break;
		case"atlas"  : res = atlas  ;break;
		case"nm" 	 : res = nm   ;break;
		}

		for(int i=0;i<res.length;i++) { //배열에는 항상 for문과 함께함
			System.out.println(res[i]);	//렝스는 엘리먼트임 다 입력해 주기
										//힘드니까
		}
		
	
	}
}

