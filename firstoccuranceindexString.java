package JavaCodingQuestions;

public class firstoccuranceindexString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="sadbutnotsad";
String st="but";
String newst = "";
for(int i=0;i<s.length();i++)
{
	
	if(s.charAt(i)==st.charAt(0))
	{
		newst = s.substring(i, i+st.length());
		
		if(newst.equals(st))
		{
			System.out.println(newst + " ocrring at"+ i);
		}
		break;
	}
	
	
}




	}

}
