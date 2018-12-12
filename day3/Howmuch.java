package day3;

import java.util.Scanner;

public class Howmuch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("얼마예요?");
		int how = scanner.nextInt();
		System.out.println(how+"입니다.");
		System.out.println("몇개드릴까요?");
		int how2 = scanner.nextInt();
		int sum = how*how2;
		int result = 0;
		
		
		if(how>=1000){
			result = sum*80/100;
		}else if(how>=500){
			result = sum*90/100;
		}else{
			result = sum;
		}
			//System.out.println(result+"입니다.");
			System.out.printf("%d입니다",result);
			
	
			
		}
	}
		
