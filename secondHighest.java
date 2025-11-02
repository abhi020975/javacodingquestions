package JavaCodingQuestions;

import java.util.Arrays;

public class secondHighest {
	public static void main (String[] args)
	{
		
		int[] a = {22,12,34,76,43};
		
		int max = -1;
		int s = -1;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				//s=max;
			}
			else if (a[i]<max&&a[i]>s)
			{
				s=a[i];
			}
		}
		
		System.out.println(s);
	}
}
