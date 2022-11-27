package Assign;

public class Pangram {

	public static void main(String[] args)
	{
		boolean flag = false;
		String s1 = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
		s1=s1.replace(" ","");
		
		char [] ch = new char[s1.length()];
		for (int i = 0; i < s1.length(); i++) 
		{
            ch[i] = s1.charAt(i);
        }
		
		int[] ar=new int [26];
		for(int i=0;i<ch.length;i++) 
		{
			ar[ch[i]-65]++;
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==0) {
				System.out.println("It is not a pangram");
				flag = true;
				
			}
		}
		if(flag==false) 
		{
			System.out.println("It is a pangram");

		}
		

	}

}
