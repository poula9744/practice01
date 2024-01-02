package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {

		double width;
		double height;
		
		double area;
		double perimeter;
		
		Scanner sc = new Scanner(System.in); 
		
		//가로 길이
		System.out.print("가로를 입력하세요: ");
		width = sc.nextDouble(); 
		
		//세로 길이
		System.out.print("세로를 입력하세요: ");
		height = sc.nextDouble();
		
		
		//사각형의 넓이
		area = width*height;
		System.out.println("사각형의 넓이는 " + area);
		
		//사각형의 둘레
		perimeter = width*2+height*2;
		System.out.println("사각형의 둘레는 " + perimeter);
		
		sc.close();
	}

}
