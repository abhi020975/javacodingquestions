package JavaCodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingchaindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s ="ppaleel";

Map<Character, Integer> map = new HashMap();

for(char c : s.toCharArray())
{
	map.put(c, map.getOrDefault(c, 0)+1);
}

for(char c : map.keySet())
{
	if(map.get(c)==1)
	{System.out.println(c);
		break;
	}
}


}
}
