package JavaCodingQuestions;

public class FindOccuranceofcharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "jayja";
		char st='j';
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==st)
			{
				count++;
			}
		}
		
		System.out.println("occuring  "+ count+" times");
	}

}
