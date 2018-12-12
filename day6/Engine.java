package day6;
 import java.util.Scanner;
 public class Engine {
 	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean falg = true;
		while(falg) {
			System.out.println("[메뉴] 0.종료 1.오칙연산 2.BMI 3.윤년 계산기 4.성별 판별기 5.합이 55");
			String op = scanner.next();
			switch(op) {
			case "0" :
				System.out.println("종료");
				return; 
			case "1" :
				System.out.println("1.오칙연산");
				
				int a = scanner.nextInt();
				String t = scanner.next();
				int b = scanner.nextInt();
				int result = 0;
				switch(t) {
				case "+" : result = a+b; break;
				case "-" : result = a-b; break;
				case "*" : result = a*b; break;
				case "/" : result = a/b; break;
				case "%" : result = a%b; break;
				
				}
				System.out.println("="+result);
				break;
				
			case "2" :
				System.out.println("BMI");
				System.out.println("몸무게");
				double a1 = scanner.nextDouble();
				System.out.println("키");
				double b1 = scanner.nextDouble();
				Double bmi = a1/(b1*b1)*10000;
				String u1= "";
				if(bmi>=40.0) {
					u1 = "고도 비만";
				} else if(bmi>=35.0) {
					u1 = "중등도 비만";
				} else if(bmi>=30.0) {
					u1 = "경도 비만";
				} else if(bmi>=25.0) {
					u1 = "과체중";
				} else if(bmi>=18.5) {
					u1 = "정상";
				} else {
					u1 = "저체중";
				}
				System.out.println("BMI :"+bmi);
				System.out.println(u1);
				break;
			case "3" :
				System.out.println("윤년 계산기");
				System.out.println("년도 :");
				int a3 = scanner.nextInt();
				String u2 = "";
				if(a3%4 ==0 && a3%100 !=0 || a3%400==0) {
					u2 = "윤년";
				}else {
					u2 = "평년";
				}
					
				break;
			case "4" :
				System.out.println("성별 판별기");
				int a4 = scanner.nextInt();
				String u3 = "";
				char ch = u3.charAt(7);
				if(ch=='1' || ch=='3') {
					u3 = "남자";
				} else if(ch=='2' || ch=='4') {
					u3 = "여자";
				} else if(ch=='5' || ch=='6') {
					u3 = "외국인";
				} else {
					u3 = "다시 입력하세요";
				} 
				System.out.println(u3);
				break;
			}
		}
	}
}
