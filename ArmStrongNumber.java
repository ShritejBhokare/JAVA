import java.util.Scanner;
class ArmStrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num=sc.nextInt();
		int original=num;
		int temp=num;
		int sum=0;
		int count=0;
		while(temp!=0)
		{
		    count++;
		    temp=temp/10;
		}
		while(num!=0)
		{
		  int digit=num%10;
          int s1=1;
		  for (int i=1;i<=count;i++ )
		  {
			s1=s1*digit;
		  }
          sum=sum+s1;
          num=num/10;
		}
		
		System.out.println(sum==original?"its Armstrong no":"its not armstrong no");
	}
}