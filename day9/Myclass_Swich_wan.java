package day9;

import java.util.Scanner;

public class Myclass_Swich_wan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[]class1 = new String[20]; // 홀수로 못함?
		String[]vivace = {"은지","서우","지우","창준","현일"};
		String[]royal = {"창하","정욱","은영","수호"};
		String[]atlas= {"준영","준수","은지","윤영"};
		String[]nm = {"정우","오윤","수지","티파니"};
		
		System.out.println("팀명을 입력하세요");
		String team = scanner.next(); 
		String result = "";
		
		switch(team) {
		
		case "vivace" :
			for(int i = 0;i<vivace.length;i++) { // length 길이라는데 랭스를 안써주면?
				System.out.println(vivace[i]+"\t"); //t는 뭘까..[]문법인가?
				
			}
			break;//왜 브레이크를 밖에다 해줄까..
		
		
		case "royal" :
			for(int i = 0; i<royal.length;i++) {
				System.out.println(royal[i]+"\t");
			
			}
			break;
		case "atlas" :
			for(int i = 0; i<atlas.length;i++) {
				System.out.println(atlas[i]+"\t");
			}
			break;
		case "nm" :
			for(int i =0; i<nm.length;i++) {
				System.out.println(nm[i]+"\t");
			}
			break;
	}
		}
			}