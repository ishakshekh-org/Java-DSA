package com.ishak;

import java.util.Scanner;

// Autotmatic Conversion of DataTypes into campatible types automatically

public class TypeCasting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Automatic Typecasting
		float num = sc.nextInt();
		System.out.println(num);

		// Manual Typecasting
		int number = (int) 56.56568f;
		System.out.println(number);

		// Automatic type Promotion
		int a = 257;
		byte b = (byte) (a);
		System.out.println(b);

	}

}