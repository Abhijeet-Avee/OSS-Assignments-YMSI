package day1;

import java.util.Scanner;

public class Table {
	
	public static void mulTable(int n)
	{
		for(int i=-1;i<=n;i++)
		{
			if(i==-1)
				System.out.print(" * | ");
			else if(i==0)
				System.out.print("---");
			else
			System.out.print(" "+i + " | ");
			for(int j=1;j<=n;j++)
			{
				if(i==-1)
					System.out.print(" "+ (j));
				else if(i==0)
					System.out.print("---");
				else
				System.out.print(" "+ i*j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = in.nextInt();
		mulTable(n);
		in.close();
	}
}