package JavaCodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class findDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s= "abacdeaiui";
		
		char[] sr=s.toCharArray();
		Map <Character,Integer> map= new HashMap<>();
		
		for(char c : sr)
		{  
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		
		for(char c: map.keySet())
		{
			if(map.get(c)!=1)
			{
				System.out.println("duplicate charcter are : "+c +"  whose value is "+map.get(c));
			}
		}
		
		
		
		
	}

}
