import java.util.Scanner;
class ReverseNumber
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter a number : ");
   int a=sc.nextInt();
   int rev=0;
   int original=a;
   
   while(a>0)
   {
    int digit=a%10;
    rev=rev*10+digit;
    a=a/10;
   }
   System.out.print("Reverse number is "+rev);
  }
}