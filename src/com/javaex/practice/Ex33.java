package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//반지름 
		System.out.print("반지름: ");
		double radius = sc.nextDouble();
		
		//구의 부피
		System.out.print("구의 부피는: " + (4.0/3.0)*3.14*radius*radius*radius + " 입니다.");
		
		sc.close();
	}

}

/*
	public static void main(String[] args) {
		
		double radius;
		double volume;
		Scanner sc = new Scanner(System.in);
		
		//반지름 입력
		System.out.print("반지름:  ");
		radius = sc.nextDouble();
		
		//구의 부피 계산
		volume = (double)4/(double)3 * 3.14 *(radius*radius*radius);
		
		//구의 부피 출력
		System.out.println("구의부피는: " + volume + " 입니다." );
		
		sc.close();

	}

*/