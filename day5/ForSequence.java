package day5;

import java.util.Scanner;

public class ForSequence {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1부터 10까지 더한 숫자");
		
		String result = "";
		int sum = 0;
		
		for(int i=1 ; i<=10 ;i++ ) {
			
			if(i==10) {
				result += i+"=";
			}else{
				result += i+"+";
		}
		   sum += i; 
	}	//System.out.println(sum+result);
		System.out.printf("%s %d ",result,sum);
	}
	
	
}
