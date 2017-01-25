package org.kims.baekjoon.io;

import java.util.Scanner;

public class WriteStar_1
{
	public void writeStar_1()
	{
		int N = 0;
		Scanner scan = new Scanner(System.in);
		
		N= scan.nextInt();
		if (N < 1 || N > 100)
		{
			N = 0;
			writeStar_1();
		}
		
		scan.close();
		
		for (int i = 1; i <= N; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
