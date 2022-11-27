package Assign;

public class Palindrom {
	public static void main(String[] args) {
		int num=2552, temp,sum=0, rem;
		temp = num;
		while(num>0) { 
			rem = num%10;    
			sum = (sum*10)+rem;  
			num = num/10;  
		}
			if(temp==sum)
			{
				System.out.println("It is a Palindrom Number ");
			}
			else {
				System.out.println("It is not a Palindrom Number ");
			}
		}

}
