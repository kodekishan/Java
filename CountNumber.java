package prime;

import java.util.Scanner;

public class CountNumber {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		int flag=0;
		int chk=0;
		System.out.println("Enter 5 Number :-");
		int ary[]=new int[5];
		for(int i=0;i<5;i++)
		{
			ary[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			count=0;
			chk=ary[i];
			for(int j=0;j<5;j++)
			{
				if(chk==ary[j])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(chk+" Present twice in Array");
				break;
			}
		}
		System.out.println("Unique Element in Arrays :-");
		for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i != j)
                {
                    if(ary[i] != ary[j])
                    {
                        flag=1;
                    }
                    else
                    {
                        flag=0;
                        break;
                    }
                }
            }
            if(flag==1)
            {
                count++;
                System.out.print(ary[i]+" ");
            }
        }
		System.out.println("");
		System.out.println("Number Present in List: -");
		System.out.println("");
		for(int i=0;i<5;i++)
		{
			chk=ary[i];
			count=0;
			for(int j=0;j<5;j++)
			{
				if(chk==ary[j])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(chk+" Present "+count+" times in list");
			}
		}
	}
}