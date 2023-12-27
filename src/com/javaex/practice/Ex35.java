package com.javaex.practice;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long light = 300000L*60*60*24*365; //곱하다 보면 int를 넘어감. 처음부터 long형으로 크게 만들면 정상값
		
		System.out.println("빛이 1년 동안 가는 거리는 " + light + " km 입니다.");
		
		sc.close();
		

	}

}
