package JavaCodingQuestions;

public class separateDigitAndLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Abhi0209shek12s1i3n5g7h2";
		char[] cs = s.toCharArray();
		StringBuilder sb1= new StringBuilder();
		StringBuilder sb2= new StringBuilder();
		for(char c : cs)
		{
			if(Character.isDigit(c))
			{sb1.append(c);
				
			}
			else if(Character.isLetter(c))
			{
				sb2.append(c);
			}
		}
		System.out.println("digits  " +sb1.toString() );
		System.out.println("letters  " +sb2.toString() );
		
		
	}

}
