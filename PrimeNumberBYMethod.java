import java.util.Scanner;
class PrimeNumberBYMethod
{
	public static void main(String[] args) 
	{
		
		PrimeNo(5);
	}
	public static void PrimeNo(int num)
	{
        int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		System.out.print(count==2?"it is prime":"it is not prime");
	}
}