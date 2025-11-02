package JavaCodingQuestions;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=" the is the main method   ";
		s=s.trim();
		int count =0;
		for(int i=s.length()-1;i>0;i--)
		{
			
			if(s.charAt(i)!=' ')
			{
				count++;
			}
			
			else
				break;
		}
		System.out.println(count);
	}

}
