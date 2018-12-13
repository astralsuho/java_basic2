package day3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("[메뉴]\n"
					+ "0.정지\n"
					+ "1.성별체크\n"
					+ "2.얼마예요?");
			String select = scanner.next();
			
			switch(select) {
			
			case "0" : 
				System.out.println("정지");
				return ;
			case "1" :
				GenderChecke checke = new GenderChecke();
				checke.test();
				break;
			case "2" :
				Howmuch howmuch = new Howmuch();
				howmuch.test();
			}
		}
		
		
	}

}
