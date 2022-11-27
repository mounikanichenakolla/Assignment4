package Assign;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String s1 = "javaProgramming";
		//char [] s1 = s.toCharArray() ;
		String s2 = "";
		System.out.println("Before Removing Duplicates:"+" "+s1);
		for(int i=0;i<s1.length();i++)
		{
			Boolean flag  = false;
		
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j))
				{
					flag = true;
					break;
				}
			}
			if(flag==false)
			{
				  s2 = s2.concat(String.valueOf(s1.charAt(i)));	
			}
			
			
		}
		System.out.println("After Removing Duplicates:"+" "+s2);
	}

}
