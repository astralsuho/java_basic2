package day7;

import java.util.Scanner;import org.omg.Messaging.SyncScopeHelper;

public class Calc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("계산기");
		
		int a = scanner.nextInt();
		String op = scanner.next();
		int b = scanner.nextInt();
		int result = 0;
		
		switch(op) {
		case "+" : result = a + b ;break; 
		case "-" : result = a - b ;break; 
		case "*" : result = a * b ;break; 
		case "/" : result = a / b ;break; 
		case "%" : result = a % b ;break; 
		 
		
		}
	
		System.out.printf("%d %s %d = %d ",a,op,b,result);
		
		
	}

}
