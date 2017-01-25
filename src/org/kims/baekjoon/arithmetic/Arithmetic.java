package org.kims.baekjoon.arithmetic;

import java.util.Scanner;

public class Arithmetic
{

	public void arithmetic()
	{
		int A, B;
		String m;
		String[] value;

		Scanner scan = new Scanner(System.in);

		m = scan.nextLine();
		value = m.split(" ");
		A = Integer.parseInt(value[0]);
		B = Integer.parseInt(value[1]);

		if (A < 1 || (B > 10000 || B == 0))
		{
			scan.close();
			return;
		}

		scan.close();
		
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);
	}
}
