package org.kims.baekjoon.io;

import java.util.Scanner;

public class Gugudan
{
	public void gugudan()
	{
		int N = 0;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		if (N < 1 || N > 9)
		{
			N = 0;
			gugudan();
		}

		scan.close();

		for (int i = 1; i < 10; i++)
		{
			System.out.printf("%d * %d = %d\n", N, i, (N * i));
		}
	}
}
