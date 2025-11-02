package JavaCodingQuestions;

public class reverseevenWordsinString {
	public static void main(String[] args)
	{
		String s ="i love java most";
		
		String[] st = s.split(" ");
		
		StringBuilder sb= new StringBuilder();
		
		int i=1;
		
		for(String str: st)
		{
			
			if(i%2==0)
			{
				sb.append(new StringBuilder(str).reverse());
				sb.append(" ");
			}
			else
				{sb.append(str);
			sb.append(" ");
				}
			
			i++;
			
			
			
		}
		
		
		System.out.println(sb.toString());
		
	}
}
