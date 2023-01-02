import java.util.Scanner;
class CountDigits
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num=sc.nextInt();
		int count=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		System.out.print("length of the Entered number is : "+count);
		
	}
}