package JavaCodingQuestions;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" this is a game   ";
		String st=s.trim();

		String sa[]=st.split(" +");
		StringBuilder sb=new StringBuilder();
		for(int i=sa.length-1;i>=0;i--)
		{
			sb.append(sa[i]+" ");
		}

		System.out.println(sb.toString());

	}




}
