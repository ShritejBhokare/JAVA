import java.util.Scanner;
class Palindrome
{
 public static void main(String[] args)
 {

  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  int a=sc.nextInt();
  int rev=0;
  int original=a;

  while(a>0){
       int num=a%10;
       rev=rev*10+num;
       a=a/10;
  }
  System.out.println("rev num is"+rev);

  if(original==rev)
     System.out.println("it is a palindrome");
  else
     System.out.println("it is not palindrome");
  

 }
}