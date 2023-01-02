import java.util.Scanner;
class SumOfDigitsEvenOrOdd
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
	    System.out.println("sum of digits of entered number is : "+sum);
	    if(sum%2==0)
	    	System.out.print(sum+"it is even no");
	    else
	    	System.out.print(sum+"it is odd no");
	}
}