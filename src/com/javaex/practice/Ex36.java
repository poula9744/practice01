package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("500원 개수: ");
		int Obeak = sc.nextInt();
		
		System.out.print("100원 개수: ");
		int beak = sc.nextInt();
		
		System.out.print("50원 개수: ");
		int Osip = sc.nextInt();
		
		System.out.print("10원 개수: ");
		int sip = sc.nextInt();
		
		int all = 500*Obeak+100*beak+50*Osip+10*sip;
				
		System.out.println("동전의 총합은 " + all + " 원 입니다.");
		
		sc.close();
	}

}
