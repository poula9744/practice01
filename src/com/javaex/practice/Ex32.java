package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//가로 
		System.out.print("가로: ");
		double width = sc.nextDouble();
		
		//세로
		System.out.print("세로: ");
		double weight = sc.nextDouble();
		
		//넓이 
		System.out.println("삼각형의 높이는 " + width*weight/2 + " 입니다." );
		
		sc.close();
	}

}
