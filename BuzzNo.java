import java.util.Scanner;
class BuzzNo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any no ");
		int a=sc.nextInt();

		if(a%7==0 || a%10==7)
			System.out.print(a+" it a Buzz No ");
		else
			System.out.print(a+" it is not a buzz No");
	}
}
