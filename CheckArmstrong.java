import java.util.Scanner;
class CheckArmstrong
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter any number");
  int a=sc.nextInt();
  int sum=0;
  int original=a;
  while(a>0)
  {
   int digit=a%10;
   sum=sum+digit*digit*digit;
   a=a/10;
  }
  if(original==sum)
  System.out.print("it is an armstrong number");
  else
  System.out.print("it is not an armstron number");
 }
}