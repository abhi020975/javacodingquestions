package JavaCodingQuestions;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicate {
	
	public static void main(String[] args)
	{
		String s= "aabbcccccdeefkqqsaaa";
		
		
		Set set= new HashSet<>();
		String str="";
		for(int i=0;i<s.length();i++)
		{
			if(!set.contains(s.charAt(i)))
			{
			set.add(s.charAt(i));
			str= str+s.charAt(i);
			
			}
		}
		System.out.println(str.toString());
		
		
	}

}
