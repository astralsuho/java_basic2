package Gerenlianxi;

import java.util.Scanner;

public class For_1 {
//for문 사용하여 1부터 10까지 숫자를 더하시오
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1부터 10까지 더한 숫자");
		
		String res = "";
		int sum = 0;
		
		for(int i=1 ; i<=10 ;i++) {
			
			if(i!=10) {
				res += i+"+";
			}else{
				res += i+"=";
			}
			sum += i;
		}
			System.out.println(res+sum);
			
	}
	
}