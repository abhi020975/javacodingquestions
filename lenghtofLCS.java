package JavaCodingQuestions;

import java.util.ArrayList;
import java.util.*;

public class lenghtofLCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="abcadaabababa";
		
		List l =new LinkedList();
		Set l1 =new LinkedHashSet();
		int start=0,end=0,maxlength=0;
		
		while(end<s.length())
		{
			if(!l.contains(s.charAt(end)))
			{
				l.add(s.charAt(end));
				l1.add(s.charAt(end));
			end++;
			
			maxlength = Math.max(maxlength, l.size());
			}
			
			
			else
			{
				l.remove(Character.valueOf(s.charAt(start)));
				start++;
			}
		}
		System.out.println(maxlength);
		System.out.println(l1);

	}

}
