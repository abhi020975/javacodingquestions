package JavaCodingQuestions;

public class reverseStringConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s= "abhishek";
String a ="";

for(int i =s.length()-1;i>=0;i--)
{
	a=a+ s.charAt(i);
}
System.out.println(a);
}
}