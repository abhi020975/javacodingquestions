package JavaCodingQuestions;

public class reverseVowels {

	public static void main(String[] args)
	{
	String s= "lotus";
	int i=0,j=s.length()-1;
	while(i!=j)
		
	{
		if(!isvowel(s.charAt(i)))
		{
			i++;
		}
		if(!isvowel(s.charAt(j)))
		{
			j--;
		}
		
		if(isvowel(s.charAt(i))&& isvowel(s.charAt(j)))
		{
			char temp;
			
			temp=s.charAt(i);
			s.charAt(i)=s.charAt(j);
		}
	}
	
	
	}
	
	
	public static boolean isvowel(char c )
	{
		
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			return true;
		}
		
		else
		return false;
		
	}
}
