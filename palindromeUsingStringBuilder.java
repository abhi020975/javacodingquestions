package JavaCodingQuestions;

public class palindromeUsingStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "abbcbba";
		
		StringBuilder str=new StringBuilder(s);
		
		String reverse=str.reverse().toString();
		
		if(s.equals(reverse))
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");
	}

}
