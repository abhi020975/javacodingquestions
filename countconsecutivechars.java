package JavaCodingQuestions;

public class countconsecutivechars {
	public static void main(String[] args) {
		
		String s ="aaabbcccabs";
		int count =1;
		StringBuilder sb = new StringBuilder();
		char[]c= s.toCharArray();
		for(int i=0;i<=c.length;i++)
		{if(i+1<c.length)
		{
			if(c[i]==c[i+1])
			{
				count++;
			}
			else
			{
				sb.append(c[i]).append(count).append(',');
				count=1;
			}
		}
		}
		System.out.println(sb);
		
	}
}
