package com.javaex.practice;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("월급을 입력하세요(만 원): ");
		
		//월급 입력 
		int month = sc.nextInt(); 
		
		
		
		System.out.println("10년동안 최대 저축액은 " + month*12*10 + "만 원 입니다.");
		
		sc.close();
	}

}
