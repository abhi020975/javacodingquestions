package JavaCodingQuestions;

import java.util.Arrays;

public class longestprefix {
	public static void main(String[] args)
	{
		String[] s= {"flower" , "flow", "floght"};
		Arrays.sort(s);
		int i=0, j=s.length;
		String str="";
		while(s[0].charAt(i)==s[s.length-1].charAt(i))
		{
			str=str+s[0].charAt(i);
			i++;
		}
		System.out.println(str);
	}
}
