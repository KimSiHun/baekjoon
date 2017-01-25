package org.kims.baekjoon.io;

import java.util.Scanner;

public class WriteNReverse
{
	public void writeNReverse()
	{
		int N = 0;
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		if (N < 1 || N > 100000)
		{
			N = 0;
			writeNReverse();
		}
		
		scan.close();
		
		for (int i = N; i >0; i--)
		{
			System.out.println(i);
		}
		
	}
}
