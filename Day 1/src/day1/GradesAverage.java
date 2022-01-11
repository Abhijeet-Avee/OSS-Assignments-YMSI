package day1;

import java.util.Scanner;

public class GradesAverage {
	
	private static Scanner in;

	public static void gradeFunc(int num)
	{
		int grade, avg=0;
		in = new Scanner(System.in);
		int [] grades = new int[num];
		for(int i=0;i<num;)
		{
			System.out.print("Enter the grade for student "+(i+1)+": ");
			grade = in.nextInt();
			if(grade>=0 && grade<=100) {
				avg+= grade;
				grades[i] = grade;
				i++;
			}
			else {
				System.out.println("Invalid grade, try again...");
			}
		}
		System.out.println("Average grades: "+avg/num);
	}

	public static void main(String[] args) {
		int numStudents;
		in = new Scanner(System.in);
		System.out.print("Enter number of Students: ");
		numStudents = in.nextInt();
		gradeFunc(numStudents);
	}
}
