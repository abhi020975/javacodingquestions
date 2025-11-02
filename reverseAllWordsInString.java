package JavaCodingQuestions;

public class reverseAllWordsInString {
	public static void main (String[] args)
	{
		String s ="The is my name Abhishek  ";

		String s1 = reverseEachWord(s);
		
		System.out.println("    :"+s1);
		String s2 = reverseWholeString(s);
		
		System.out.println(s2);
	}
	
	
	public static String reverseEachWord (String s)
	{ 
		
		s=s.trim();
		String[] s1 =s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String sd : s1)
		{
			for(int j=sd.length()-1;j>=0;j--)
			{
				sb.append(sd.charAt(j));
			}
			sb.append(' ');
		}
		return sb.toString().trim();
		
	}
	
	
	public static String reverseWholeString (String s)
	{
		
		s=s.trim();
		String[] string = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=string.length-1;i>=0;i--)
		{
			sb.append(string[i]+" ");
		}
		
		
		return sb.toString();
		
		
		
	}
}