package day8;
/**day9폴더를 끌어서 day8에 부착**/
import java.util.Scanner;
import day9.Calc;//day9 다끌어오는게뭐더라..

public class Main {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
		while (true) {
			System.out.println("[메뉴]\n"
					+ "0.정지\n"
					+ "1.계산기\n"
					+ "2.Howmuch");
			
			String select = scanner.next();
			
			
			switch (select) {
			
			case "0" : 
				System.out.println("정지");
				return;
				
			case "1" :
				System.out.println("계산기");
				
			}

		}
	}
}