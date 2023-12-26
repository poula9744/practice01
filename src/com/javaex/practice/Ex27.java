package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//반지름 입력하기 
		System.out.print("반지름을 입력하세요: ");
		
		int half = sc.nextInt();
		
		System.out.println("원의 넓이는 " + half*half*3.14);

		sc.close();
	}

}
