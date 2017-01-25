package org.kims.baekjoon.arithmetic;

import java.util.Scanner;

public class DivideAB
{
	public void divideAB()
	{
		int A, B, C;
		String m;
		String[] value;

		Scanner scan = new Scanner(System.in);

		m = scan.nextLine();
		value = m.split(" ");

		A = Integer.parseInt(value[0]);
		B = Integer.parseInt(value[1]);
		C = Integer.parseInt(value[2]);

		if ((A < 2 || A > 10000) || (B < 2 || B > 10000) || (C < 2 || C > 10000))
		{
			scan.close();
			return;
		}

		scan.close();

		System.out.println((A + B) % C);
		System.out.println((A % C + B % C) % C);
		System.out.println((A * B) % C);
		System.out.println(((A % C) * (B % C)) % C);

	}
}
