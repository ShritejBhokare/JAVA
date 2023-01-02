import java.util.Scanner;
class SumOfDigits
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num=sc.nextInt();
	    int sum=0;
	    while(num!=0)
	    {
	    	int reminder=num%10;
	    	sum=sum+reminder;
	    	num=num/10;
	    }
	    System.out.print("sum of digits of entered number is : "+sum);
	}
}