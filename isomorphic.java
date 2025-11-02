package JavaCodingQuestions;
import java.util.*;
public class isomorphic {
	public static void main(String[] args)
	{
		String s= "egge" , t="adds";
		Map map = new HashMap();
		int i=0;
		boolean b= true;
		for(char c : s.toCharArray())
		{
			if(!map.containsKey(c))
			{
				map.put(c, t.charAt(i));
			}
			
			else
			{
				if(!map.get(c).equals(t.charAt(i)))
				{
					b= false;
				}
			}
			i++;
		}
		
		System.out.println(b);
	}
}
