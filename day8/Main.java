package day8;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
		while (true) {
			System.out.println("[메뉴]\n"
					+ "0.정지\n"
					+ "1.계산기\n"
					+ "2.Bmi\n"
					+ "3.윤년계산기\n"
					+ "4.주민번호\n"
					+ "5.등수구하기");
			
			String select = scanner.next();
			
			
			switch (select) {
			
			case "0" : 
				System.out.println("정지");
				return;
				
			case "1" :
				System.out.println("계산기");
				
			}

		}
	}
}