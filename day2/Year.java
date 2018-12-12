package day2;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Year {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("년도를 기입하세요");
		int year = scanner.nextInt();
		String result = " ";
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			result ="윤년입니다";
		}else{
			result ="평년입니다";
	}
		System.out.println(result);
	}
	}
