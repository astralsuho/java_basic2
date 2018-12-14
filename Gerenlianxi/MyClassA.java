package Gerenlianxi;

import java.util.Scanner;

public class MyClassA {
	public static void main(String[] args) {
		
		String[]result= {};//배열주문 답안설정, 난 이안에 다 가둬 넣을거임
		
		String[]vivace = {"은지","서우","지우","창준","현일"};
		String[]royal = {"창하","정욱","은영","수호"};
		String[]atlas= {"준영","준수","은지","윤영"};
		String[]nm = {"정우","오윤","수지","티파니"};
		System.out.println("팀명을 입력하세요");
		//아래부터
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		
		switch(name) {
		case"vivace":result = vivace;break;
		case"royal":result = royal;break;
		case"atlas":result = atlas;break;
		case"nm":result = nm;break;
		default : System.out.println("잘못된 팀명입니다.");//result 배열이라 sys걸어줌
		}
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
	}

}
