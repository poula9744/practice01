package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//화씨 입력
		System.out.print("화씨: ");
		double F = sc.nextDouble();
		
		//화씨 -> 섭씨
		double C = 5.0/9*(F-32);
		
		
		System.out.println("화씨 " + F + " 의 섭씨 온도는" + C + " 입니다." );
		
		sc.close();
		
		
	}

}
