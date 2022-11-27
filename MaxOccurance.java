package Assign;

public class MaxOccurance {
	public static void main(String[] args) {
		String s = "JavaProgrammer";
		
		int[] ar = new int[127];
		for(int  i= 0; i<s.length();i++)
		{
			ar[s.charAt(i)]=ar[s.charAt(i)]+1;
		}
		int max = -1;
		char c=' ';
		for(int  i= 0; i<s.length();i++)
		{
			if(max<ar[s.charAt(i)])
			{
				max=ar[s.charAt(i)];
				c=s.charAt(i);
			}
		}
		System.out.println("Maximum repeated character is: "+c);
	}


}
