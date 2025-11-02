package JavaCodingQuestions;

public class rotatearrayByN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,6,7,8};
		int n=4;
		
		int[]b=rotatearr(a,n);
		
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}

	}
	
	
	public static int[] rotatearr(int[]a , int n)
	{
		reverse(a,0,a.length-1);
		
		reverse(a,0,n-1);
		reverse(a,n,a.length-1);
		
		return a;
		
	}
	
	public static int[] reverse(int[]a , int start , int end)
	{
	while(start<end)
	{
		int temp = a[start];
		a[start]=a[end];
		a[end] =temp;
		
		
		start++;
		end--;
	}
		
		return a;
	}

}
