import java.util.Scanner;

public class Solution {
	
	
	public static int gcdsum(int n)
	{
		long sum_gcd=0;
		for(int i=1;i < n;i++) 
		{
			for(int j=i+1;j<=n;j++)
			{
				 sum_gcd += hcf(i,j);
				
			}
		}
		long m=1000000007;
		long res=sum_gcd%m;
		return (int)res;
		
	}
	public static int  hcf(int x, int  y)
	{
		if(x < y)
		{
			for(int i=x;i>=1;i--)
			{
				if(x%i==0 && y%i==0)
				{
					return i;
				}
				
			}
			
		}
		if(x > y)
		{
			for(int i=y;i>=1;i--)
			{
				if(x%i==0 && y%i==0)
				{
					return i;
				}
				
			}
			
		}
		
			return x;
		
		
	}

	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the no of elements:");
		n=sc.nextInt();
		int res=gcdsum(n);
		System.out.println("result=>" + res);
		
		sc.close();
		
	}

}
