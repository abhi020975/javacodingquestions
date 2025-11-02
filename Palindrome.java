package JavaCodingQuestions;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "abcdcbsa";
		boolean b= palindrome(str);
		
         System.out.println(b);
	}
	
	public static  boolean palindrome(String s)
	{
	
	int i=0, j=s.length()-1;
	while(i!=j)
	{
		if(s.charAt(i)!=s.charAt(j))
		{System.out.println("not palindrome");
			return false;
		}
		
		i++;
		j--;
	}
	
	return true;
	}
	

}
