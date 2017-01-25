package org.kims.baekjoon.io;

import java.util.Scanner;

public class WriteStar_2
{
	public void writeStar_2()
	{

		int N = 0;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		if (N < 1 || N > 100)
		{
			writeStar_2();
		}

		scan.close();

		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < N - i; j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
