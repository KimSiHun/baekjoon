package org.kims.baekjoon.arithmetic;

import java.util.Scanner;

public class SUMAB
{

	public void sumAB()
	{
		int A, B = 0;
		String m;
		String[] value;
		Scanner scan = new Scanner(System.in);

		m = scan.nextLine();
		value = m.split(" ");
		A = Integer.parseInt(value[0]);
		B = Integer.parseInt(value[1]);
		if (A < 1 || B > 9)
		{
			scan.close();
			return;
		}
		scan.close();
		System.out.println(A + B);

	}

}
