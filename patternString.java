package JavaCodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class patternString {

	
	public static void main(String[] args)
	{
		
		String s= "dog cat cat doggy";
		String pattern="abba";
		Map map= new HashMap();
		String[] str = s.split(" ");
		
		boolean b = true;
		char[] c = pattern.toCharArray();
		int i=0;
		for(char ch :c)
		{
			if(!map.containsKey(ch))
			{
				map.put(ch, str[i]);
				
			}
			else
			{
				if(!map.get(ch).equals(str[i]))
				{
					b = false;
					
					break;
					
				}
			}
			i++;
		}
		
		System.out.println(b);
		
	}
}
