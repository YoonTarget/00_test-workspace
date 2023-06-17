package com.kh.test;

import java.util.Scanner;

public class Test2 {
	
	public void printNum() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 10사이의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(1 <= num && num <= 10) {
			for(int i = 1; i <= num; i++) {
				if(i % 2 == 1) {
					System.out.print(i + " ");
				}
			}
		}
		else {
			System.out.println("1과 10 사이의 숫자가 아닙니다.");
		}
		
		sc.close();
		
	}

}
