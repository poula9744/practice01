package com.javaex.practice;

public class Ex13 {

	public static void main(String[] args) {
		
		//정수형으로 나와 2.6에서 소수점이 떨어진 2가 결과값이 된다
		System.out.println(13/5); 
		
		//강제 형변환 후, 자동 형변환(정수형에서 실수형으로 변환) 
		System.out.println((double)13/5);
		System.out.println(13/(double)5);
		System.out.println(13.0/5);
		System.out.println(13/5.0);
		System.out.println((double)(13/5));
		
		//강제 형변환
		System.out.println((double)13/(double)5);
		

	}

}
