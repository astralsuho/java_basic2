package day9;

import java.util.Scanner;

public class Myclass_For_wan2 {

	public static void main(String[] args) {
		    
	        String[] vivace = {"은지","지은","창준","서우","현일"};
	        String[] royal = {"창하","수호","정욱","은영",""};
	        String[] atlas = {"동준","종협","이레","지은",""};
	        String[] ntom = {"정우","태혁","승아","기호",""};
	        System.out.println("팀장만");
	        String[] res = new String[4];
	        String[][] myClass = {vivace,royal,atlas,ntom};
	        
	        for(int i=0;i<1;i++) { //큐브을 열
	            
	            for(int j=0;j<4;j++) { // 팀을숫자
	            res[j]  = myClass[j][i];
	            }
	            
	        }
	        for(int i=0;i<res.length;i++) {
	            System.out.print(res[i]+"\t");
	        }
}
		}