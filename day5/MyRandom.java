package day5;
import java.util.Scanner;
import java.util.Random; //랜덤을 끌어옴?

public class MyRandom {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
		System.out.println("1부터 10까지 출력");
		Random random = new Random();//import 때문에 써주는 건가?
		int limit = random.nextInt(10); //limit:제한(변수)
		System.out.println("랜덤수"+limit);
		int count = 1;
		String result = "";
		int sum = 0;
		
		while(count<=limit) {
			
		if(count!=limit) {
			result +=count+"+";	
			
		}else{
			result +=count+"=";
		}
		sum +=count; // += 휠방식 초기값0에서 count값을 더해간다라는 뜻
		count++;
}
		System.out.println(result+sum);
	}
		}
