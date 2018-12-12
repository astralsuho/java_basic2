package day5;

import java.util.Scanner;

public class WhileSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("기입값까지 더함");
		int limit = scanner.nextInt();
		int count = 1;
		int sum = 0;
		String result ="";
		
		while(count<=limit) { //  1<=임의숫자 보다 크거나 같으면  
			if(count!=limit) {    // 1은 임의숫자와 같지 않으면
				result += count+"+"; //임의숫자는 count+1 해주고 +넣어준다  //result = result+ count+"+";
			}else{					//아니라면 
				result += count+"="; //임의 숫자는 더하기 1을 해주고 결과값(=)을 넣어준다
			
				}
			sum+=count; // 
			count++;
			}
		System.out.printf("%s %d",result,sum);	
		}
	}
