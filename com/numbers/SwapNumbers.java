package com.numbers;

public class SwapNumbers {

	public static void main(String[] args) {

		// swapping of two numbers using third variable
		int num1 = 10;
		int num2 = 20;
		int temp;

		System.out.println("num1 before swapping : " + num1);
		System.out.println("num2 before swapping : " + num2);

		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("num1 after swapping : " + num1);
		System.out.println("num2 after swapping : " + num2);

		// swapping of two numbers without using third variable
		int n1 = 50;
		int n2 = 100;

		n1 = n1 + n2; // here n1=150 = 50+100
		n2 = n1 - n2; // here n2=150-100=50
		n1 = n1 - n2; // n1= 150-50

		System.out.println("n1 after swapping : " + n1);
		System.out.println("n2 after swapping : " + n2);

	}

}
