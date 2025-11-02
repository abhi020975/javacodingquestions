package JavaCodingQuestions;

public class almostEquivalent {
	public static void main(String[] args)
	{
		String s1 = "aaaa";
		String s2 = "bccb";
		int sum1 = 0 , sum2=0 ;
		
		for(int i=0;i<s1.length();i++)
		{
			sum1 = sum1+s1.charAt(i);
		}
		for(int i=0;i<s2.length();i++)
		{
			sum2 = sum1+s2.charAt(i);
		}
		
		char diff = (char)(sum2-sum1);
		
		System.out.println(diff);
	}
}
