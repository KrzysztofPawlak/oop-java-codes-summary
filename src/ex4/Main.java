package ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double fahrenheit;
		
		Scanner sc = new Scanner(System.in);
		fahrenheit = sc.nextDouble();
		System.out.println(convert(fahrenheit));
	}

	public static double convert(double fahrenheit) {
		double celsius = (5.0 / 9.0) * (fahrenheit - 32);
		return celsius;
	}
}
