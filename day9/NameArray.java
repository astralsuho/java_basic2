package day9;
/**학생수 3명 평균점수는 0~100점 사이
 * 3명을 평균 점수를 입력하면 1등 홍길동 2등 김유신 3등 김구
 * 이렇게 나오도록 해주세요 동점은 없습니다.*/

import java.util.Scanner;

public class NameArray {
public void test() {
	Scanner scanner = new Scanner(System.in);
	String[] name = new String[3];
	name[0] = "홍길동";
	name[1] = "홍길순";
	name[2] = "홍길진";
	String result = "";
	for(int i=0 ; i<3;i++) {
		if(i<2) {
			result += name[i]+",";
		}else{
			result += name[i]+" ";
		}
	}
	System.out.println(result);
}
	public static void main(String[] args) {
		NameArray nameArray = new NameArray();
		 nameArray.test();
				
	}
}
