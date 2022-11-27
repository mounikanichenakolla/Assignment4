package Assign;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "DIVYA";
		String s2 = "VIDYA";
		
		
		
		char [] ch1 = new char[s1.length()];
		for (int i = 0; i < s1.length(); i++) 
		{
            ch1[i] = s1.charAt(i);
        }
		char [] ch2 = new char[s2.length()];
		for (int j = 0; j < s2.length(); j++) 
		{
            ch2[j] = s2.charAt(j);
        }
	
			
		
		  for(int i=0;i<ch1.length;i++) 
		   {
			
			 for(int j=i+1; j<ch1.length; j++)  
	           {  
	               if(ch1[i] > ch1[j])  
	               {  
	                 char  temp = ch1[i];  
	                   ch1[i] = ch1[j];  
	                   ch1[j] = temp;  
	               }  
	           }  
	       }
		  System.out.println("After Sorting DIVYA as: ");

		  for(char el:ch1 ) 
		   {
	
				System.out.print(el+" ");
		   }
		  System.out.println();
				
			
		  for(int i=0;i<ch2.length;i++) 
		   {
			
			 for(int j=i+1; j<ch2.length; j++)  
	           {  
	               if(ch2[i] > ch2[j])  
	               {  
	                 char  temp = ch2[i];  
	                   ch2[i] = ch2[j];  
	                   ch2[j] = temp;  
	               }  
	           }  
	       }
	
		  System.out.println("After Sorting VIDYA as: ");
		  for(char el:ch2 ) 
		   {
			  System.out.print(el+" ");
				
		   }
			System.out.println();	
				
				
				if(Arrays.equals(ch1,ch2))
				{
					System.out.println("It's Anagram");
				}
				else
				{
					System.out.println("It's not an Anagram");
				}
	
		}
	}


