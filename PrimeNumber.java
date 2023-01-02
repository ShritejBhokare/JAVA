import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a=sc.nextInt();
        int count=0;
        for(int i=2;i<=a;i++)
        {
        	if(a%i==0)
        		count++;
        }
        System.out.print(count);
        if(count==1)
        	System.out.print("it is a prime no ");
        else
        	System.out.print("it is not a prime no ");
	}
}