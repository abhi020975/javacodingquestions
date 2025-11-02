package JavaCodingQuestions;

import java.util.Arrays;

public class mergeTwoArrays {
	public static void main (String[] args)
	{
		int[]a = {1,2,3,4,5};
		int[] b = {7,8,9,0,1};
		int c=0;
		int[] m = new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			m[i]= a[i];
		}
		for(int j=0;j<b.length;j++)
		{
			m[a.length+j]=b[j];
			
		}
		System.out.println(Arrays.toString(m));
	}
}
