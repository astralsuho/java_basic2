package day7;

import java.util.Scanner;

public class BmI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("키와 몸무계를 입력하세요");
		double t = scanner.nextDouble();
		double w = scanner.nextDouble();
		double bmi = w/(t*t)*10000;
		String bmi2 = "";
		
		if(bmi>=40) {
			bmi2 = "고도 비만";
		}else if(bmi>=35) {
			bmi2 = "중등도 비만";
		}else if(bmi>=30) {
			bmi2 = "경도 비만";
		}else if(bmi>=25) {
			bmi2 = "과체중";
		}else if(bmi>=18.5) {
			bmi2 = "정상";
		}else{
			bmi2 = "저체중";
		}
	System.out.printf("BMI:"+"%s %s",bmi,bmi2);
	
	}
		
}
