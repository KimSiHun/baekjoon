package org.kims.baekjoon.io;

import java.util.Scanner;

// using scanner
// 
public class WriteN
{
	public void writeN()
	{
		
		int N = 0;
		
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		
		scan.close();
		
		for (int i = 1; i <= N; i++)
		{
			System.out.println(i);
		}
		
	}
}
