package JavaCodingQuestions;

import java.util.ArrayList;
import java.util.*;

public class lengthoflongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "abcababcabaa";
		int start = 0 , end =0;
		int max_length=0;
		List l=new ArrayList();
		while(end<s.length())
		{
			if(!l.contains(s.charAt(end)))
			{
				l.add(s.charAt(end));
				end++;
				max_length=Math.max(max_length, l.size());
				
				
			}
			
			else
			{
				l.remove(Character.valueOf(s.charAt(start)));
				start++;
			}
			
		}
		
		System.out.println(max_length);
		
		
	}

}
