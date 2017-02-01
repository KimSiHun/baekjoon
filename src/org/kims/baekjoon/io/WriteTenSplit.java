package org.kims.baekjoon.io;

import java.util.Scanner;

public class WriteTenSplit
{
	public void writeTenSplit()
	{
		String m = null;
		char[] chrL = null;

		Scanner scan = new Scanner(System.in);

		m = scan.nextLine();
		chrL = m.toCharArray();

		scan.close();

		for (int i = 0; i < chrL.length; i++)
		{
			if (i % 10 == 0 && i != 0)
			{
				System.out.print("\n");
			}
			System.out.print(chrL[i]);
		}
	}
}
