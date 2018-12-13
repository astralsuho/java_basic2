package day10;

import java.util.Scanner;
import day9.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("[메뉴]\n"
					+ "0.정지\n"
					+ "1.계산기\n"
					+ "2.성별\n"
					+ "3.BMI");
			
			String select = scanner.next();	
		
		switch(select) {
		
		case "0" : 
			System.out.println("정지");
			return;
		case "1" :
			Calc calc = new Calc();
			calc.test();
			break;
		case "2" :
			Gender gender = new Gender();
			gender.test();
			break;
		case "3" :
			Bmi bmi = new Bmi();
			bmi.test();
			break;
		case "4" :
			Howmuch howmuch = new Howmuch();
			howmuch.test();
			break;
		
		}	
			
		}

	}

}
