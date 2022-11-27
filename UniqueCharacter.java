package Assign;

public class UniqueCharacter 
{
	public static void main(String[] args) {
		String str = "JavaCodingProgram";
		String s =  str.toLowerCase();
		char [] ch = s.toCharArray();
	     System.out.println("Unique characters are:"+" ");
	      for(int i = 0; i < ch.length; i++) {
	         int flag = 0;
	         for(int  j=0;j<ch.length;j++)
	         {
	            if(ch[i]== ch[j] && i!=j)
	               {
	    	          flag = 1;
	    	           break;
	                }
	         }
	         if(flag == 0)
	        	 System.out.print(ch[i]+" ");
	      }
	 }
	

}
