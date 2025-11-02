package JavaCodingQuestions;

import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="peek";
		String b="keep";
		boolean bool= true;
		Map<Character,Integer> map1= new HashMap<> ();
		Map<Character,Integer> map2= new HashMap<> ();
		for(char c : a.toCharArray())
		{
			map1.put(c, map1.getOrDefault(c, 0)+1);
		}
		for(char c : b.toCharArray())
		{
			map2.put(c, map2.getOrDefault(c, 0)+1);
		}
		
		
		if(map1.size()==map2.size())
		{
			for(char ch : map1.keySet())
			{
				if(map1.get(ch)!=map2.get(ch))
				{
					bool=false;
				}
			}
		}
		
		else
			bool = false;
		
		System.out.println(bool);
	}

}
