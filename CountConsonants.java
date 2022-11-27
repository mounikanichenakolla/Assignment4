package Assign;

public class CountConsonants {
	public static void main(String[] args) {
		String s = "$petlover@";
		int vowels = 0,consonants = 0, specialCharacters=0;
		char ch[] = s.toCharArray();
		
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') 
			{
				
				vowels++;
				
			}
			else if(ch[i]>='a'&&ch[i]<='z') 
			{
				consonants++;
				
			}
			else
			{
				specialCharacters++;
			}
		}
		System.out.println("Vowels = "+vowels);
		System.out.println("Consonants = "+consonants);
		System.out.println("Special characters = "+specialCharacters);
	}

}
