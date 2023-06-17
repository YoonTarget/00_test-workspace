package com.kh.test;

import java.util.Scanner;

public class Test3 {
	
	public void sum() {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		if(num > 0) {
			for(int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println("1부터 " + num + "까지의 합 : " + sum);
		}
		else {
			System.out.println("1 이상의 숫자 입력");
		}
		
		sc.close();
			
	}
		
}
