package org.kims.baekjoon.io;

import java.util.Scanner;

public class WriteStar_3
{
	public void writeStar_3()
	{
		int N = 0;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		if (N < 1 || N > 100)
		{
			N = 0;
			scan.reset();

			writeStar_3();
		}

		scan.close();

		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < N - i; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}
