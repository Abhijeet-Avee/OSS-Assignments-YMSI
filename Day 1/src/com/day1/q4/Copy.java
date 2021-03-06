package com.day1.q4;

//Q4. Write a boolean method called copyOf(), which an int Array and returns a copy of the given
//array. The method's signature is as follows:
//public static int[] copyOf(int[] array)

import java.util.Scanner;

public class Copy {

	public static int[] copyOf(int[] array) {
		int length = array.length;
		int temp[] = new int[length];
		for(int i=0;i<length;i++) {
			temp[i] = array[i];
		}
		return temp;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int num = in.nextInt();
		int array[] = new int[num];
		System.out.println("Enter elements: ");
		for(int i=0;i<num;i++)
		{
			array[i] = in.nextInt();
		}
		int temp[] = copyOf(array);
		System.out.println("Copied array");
		for(int t : temp) {
			System.out.print(" "+t);
		}
	}
}