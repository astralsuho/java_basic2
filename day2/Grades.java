package day2;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생 이름을 입력해주세요");
		String name = scanner.next();
		System.out.println("국어, 영어, 수학, 과학, 사회 ");
		int kor = scanner.nextInt();
		int eng = scanner.nextInt();
		int math = scanner.nextInt();
		int scien = scanner.nextInt();
		int society = scanner.nextInt();
		
		int total = kor+eng+math+scien+society;
		int all = total/5;
		String result = "";

		if(all>=90) {
			result = "A";
		}else if(all>=80) { 
			result = "B";
		}else if(all>=70) {
			result = "C";
		}else if(all>=60) {
			result = "D";
		}else{
			result = "F";
			
			
}
	//System.out.println("성적은"+all+result);
		System.out.printf("%s:  총점%d 성적%s학점",name,all,result);
	}
	
			}