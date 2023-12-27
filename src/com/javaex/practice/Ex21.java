package com.javaex.practice;

public class Ex21 {

	public static void main(String[] agrgs) {
		
		int i = 10;
		int n = ++i%2; //11(증가 이후 값 대입) % 2 == 1
				
		System.out.println(i); //11
		System.out.println(n); //1
		
		//20번 문제와는 int n = i++%2;인지 int n = ++i%2;인지의 연산자의 위치 차이로 결과값이 달라진다. 

	}

}
