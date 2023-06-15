package com.kh.test;

import java.util.Scanner;

public class Test1 {
	
	public void count() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열 : ");
			String str = sc.nextLine();
			if(str.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println(str.length());
			}
		}
		
		sc.close();
		
	}

}
