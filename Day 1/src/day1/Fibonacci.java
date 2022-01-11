package day1;

import java.util.Scanner;

public class Fibonacci {
	// Fibonacci Series and calculating its average
	private static Scanner in;

	public static int fib(int n) {
		if(n==0 || n==1)
			return n;
		else
			return fib(n-1)+fib(n-2);
	}
	
	public static void printFib(int n) {
		float avg = 0;
		System.out.println("Fibonacci Series: ");
		for(int i=0;i<n;i++)
		{
			int num = fib(i);
			System.out.print(" "+num);
			avg+=num;
		}
		System.out.println("\nAverage: "+ avg/n);
	}
	public static void main(String[] args) {
		int n;
		in = new Scanner(System.in);
		System.out.print("Enter number of terms to print: ");
		n = in.nextInt();
		printFib(n);
	}
}
