package Assign;

public class PrintDuplicate 
  {
	public static void main(String[] args) 
	{
		String s= "Ineuron Job Guarantee Batch";
		String s1 = s.replace(" ", "");
		char[] ch = s1.toCharArray();
		System.out.println("Repeated Duplicate Elements are:");
		System.out.println();
		for(int i=0;i<ch.length;i++) 
		{
			int count =1;
			for(int j= i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j]) {
					count=count+1;
					ch[j]='0';
				}
					
				
			}
			
			if(count>1 && ch[i]!='0') 
			{
				System.out.println(ch[i]+" is repeated "+count+" times ");
			}
			
		}
		
	}


}
