package JavaCodingQuestions;

import java.util.*;

public class RemoveDuplciatesFromArray {
	public static void main (String[] args)
	{
		
		int[] a= {1,4,2,3,1,3,6,3,7,8,7,9};
		
		Set s= new HashSet();
		for(int i=0;i<a.length;i++)
		{
			s.add(a[i]);
		}
		
		System.out.println("after removing :" + s.toString());
	}
}
