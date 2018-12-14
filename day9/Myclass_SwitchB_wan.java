package day9;

import java.util.Scanner;

public class Myclass_SwitchB_wan {

	public static void main(String[] args) {
		
        String[] res = {};
        String[] class1 = new String[20];
        String[] vivace = {"은지","지우","창준","서우","현일"};
        String[] javachung = {"창하","수호","정욱","은영",""};
        String[] atlas = {"동준","종협","이레","지은",""};
        String[] nm = {"정우","태혁","승아","기호",""};
        System.out.println("팀을 입력하세요");
        Scanner scanner = new Scanner(System.in);
        String team = scanner.next();
        
        switch(team) {
        case "vivace" :res = vivace;break;
        case "javachung" :res = javachung;break;
        case "atals" :res = atlas;break;
        case "nm" :res = nm;break;
        default : break;
        }
        for(int i=0;i<res.length;i++) {
            System.out.printf("%s",res[i]);
        	}
        }
	}
