package org.kims.baekjoon.io;

import java.util.ArrayList;
import java.util.Scanner;

public class WriteDirect
{
	public void writeDirect()
	{
		ArrayList<String> msgs = new ArrayList<>();
		String m = null;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 100; i++)
		{
			if (scan.hasNextLine() == false)
			{
				break;
			}
			m = scan.nextLine();
			if (m.length() > 100 || m.isEmpty() || m.startsWith(" ") || m.endsWith(" "))
			{
				break;
			} else
			{
				msgs.add(m);
			}
		}

		scan.close();

		for (int i = 0; i < msgs.size(); i++)
		{
			System.out.println(msgs.get(i));
		}
	}
}
