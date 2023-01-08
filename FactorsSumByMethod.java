import java.util.Scanner;
class FactorsSumByMethod
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number ");
		int a=sc.nextInt();
		int num=a;
		factors(a);
	}


	public static void factors(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(" Sum of the factors are : "+sum);
		seprateNo(sum);
	}
	public static void seprateNo(int sum)
	{
		int sum1=0;
		while(sum!=0)
		{
			int rem=sum%10;
			sum1=sum1+rem;
			sum=sum/10;
		}
		System.out.println(" Sum od digits is "+sum1);
		primeOrNot(sum1);
	}
	public static void primeOrNot(int sum1)
	{
		int count=0;
		for(int i=1;i<=sum1;i++)
		{
			if(sum1%i==0)
			{
				count++;
			}
		}
		System.out.print(count==2?" it is prime no ":" it is not prime no");
	}
}