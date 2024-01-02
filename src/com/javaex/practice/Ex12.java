package com.javaex.practice;

public class Ex12 {

	public static void main(String[] agrgs) {
		
		//int x, y = 0; ==> 식별자는 하나만 존재할 수 있고, x와 y 모두 0으로 초기화하기 위해서는 따로따로 부여해야 한다
		int x = 0;
		int y = 0;
		
		//char grade = "A";
		char grade = 'A';
		String grade2 = "A";
		
		int salary = 2000000;
		String salary2 = "2,000,000";
		
		//byte n = 1000; ==> byte는 -128~127 범위까지 표현할 수 있다
		short n = 1000; 
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(grade);
		System.out.println(salary);
		System.out.println(n);

	}

}
