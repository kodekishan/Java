package prime;

import java.util.Scanner;

public class PerfectNumber {
	
	boolean perf(int no)
	{
		int i;
		int sum=0;
		int temp;
		temp=no;
		for(i=1;i<no;i++)
		{				
			if(no%i==0)
			{
				sum=sum+i;
				System.out.print(i+"+");
			}
		}
		System.out.println(0+"="+sum);
		if(temp==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
		int pr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number = ");
		pr=sc.nextInt();
		
		PerfectNumber pn=new PerfectNumber();
		boolean bn=pn.perf(pr);
		if(bn)
		{
			System.out.println("Number is Perfect");
			
		}
		else
		{
			System.out.println("Number is not Perfect");
		}
		
	}
}
