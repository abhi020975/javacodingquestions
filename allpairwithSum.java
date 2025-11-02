package JavaCodingQuestions;

import java.util.*;

public class allpairwithSum {

	
	public static void main (String[] args)
	
	
	{
		int[] a= {2,3,5,4,7,6,1};
		int sum=7;
		List s1= new ArrayList();
		List s;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
				{
					s= new ArrayList();
					s.add(a[i]);
					s.add(a[j]);
					
					s1.add(s);
				}
				
				
			}
		}
		System.out.println(" pairs  :" + s1.toString());
	}
}
