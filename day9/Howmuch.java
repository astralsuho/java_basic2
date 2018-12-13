package day9;

import java.util.Scanner;

public class Howmuch {

	public void test() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("얼마예요?");
		int duo = scanner.nextInt();
		System.out.println(duo+"입니다.");
		System.out.println("몇개드릴까요?");
		int jige = scanner.nextInt();
		int sum = duo*jige;
		int result = 0;
		
		if(sum>=1000) {
			result = sum*80/100;
		}else if(sum>=500){
			result = sum*90/100;
		}else{
			result = sum;
}
		System.out.printf("%d원입니다.",result);
		}
			
			}

