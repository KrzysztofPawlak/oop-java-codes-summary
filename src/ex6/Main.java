package ex6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("first number: ");
		num1 = sc.nextInt();
		System.out.println("second number: ");
		num2 = sc.nextInt();

		System.out.println("sum: " + (num1 + num2));
		System.out.println("product: " + (num1 * num2));
		System.out.println("difference: " + (num1 - num2));
		System.out.println("division: " + (num1 / num2));
	}

}
