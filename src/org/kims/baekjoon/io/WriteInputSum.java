package org.kims.baekjoon.io;

import java.math.BigInteger;
import java.util.Scanner;

public class WriteInputSum
{
	public void sumAll()
	{
		int N = 0;
		int result = 0;
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.nextLine());
		if (N < 1 || N > 100)
		{
			N = 0;
			scan.close();
			return;
		}

		String msg = scan.nextLine();

		scan.close();

		BigInteger b = new BigInteger(String.valueOf(msg));

		String[] resultList = String.valueOf(b).split("");
		for (int i = 0; i < resultList.length; i++)
		{
			result = result + Integer.parseInt(resultList[i]);
		}

		System.out.println(result);
	}
}
