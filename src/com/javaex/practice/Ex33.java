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
