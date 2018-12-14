package Gerenlianxi;


import java.util.Random;

public class MyRandom {
	public static void main(String[] args) {
		
		System.out.println("1~10까지 랜덤수 3개생성");
		int[]num = new int[5];
		Random random = new Random();
		for(int i=0;i<3;i++ ) {
			num[i]=random.nextInt(10)+1;
		}
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+"\t");
		}
		
	}
}
