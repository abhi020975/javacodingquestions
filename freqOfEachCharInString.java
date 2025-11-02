package JavaCodingQuestions;
import java.util.*;
public class freqOfEachCharInString {

	public static void main (String[] args)
	{
		String s= "abcdaabcccddddddddddjhsjuhcdjikj";
		
		Map<Character,Integer> map = new LinkedHashMap<> ();
		
		
		for(char c : s.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(char c : map.keySet())
		{
			System.out.println("frequency of " + c +"  is : "+map.get(c));
		}
		
		
	}
	
}
