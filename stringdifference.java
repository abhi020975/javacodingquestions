package JavaCodingQuestions;

public class stringdifference {
	public static void main(String[] args)
	{
		String s1="abcde";
		String s2 = "abcd";
		int count1=0 , count2=0;
		char[] c1=s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		for(int i=0;i<c1.length;i++)
		{
			count1 =count1+c1[i];
		}
		
		for(int i=0;i<c2.length;i++)
		{
			count2 =count2+c2[i];
		}
		
		System.out.println(count1);
		System.out.println(count2);
		char diff = (char) (count1-count2);
		
		System.out.println(diff);
	}
}
