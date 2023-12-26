package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//상품가격 
		System.out.print("상품가격: ");
		double price = sc.nextDouble();
		
		//받은 돈 
		System.out.print("받은 돈: ");
		double money = sc.nextDouble();
		
		System.out.println("============================");
		
		//출력 
		System.out.println("받은 돈: " + money);
		System.out.println("상품가격: " + price);
		System.out.println("부가세: " + price*0.1);
		System.out.println("잔액: " + (money-price));
		
		sc.close();
	}

}
