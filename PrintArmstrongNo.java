class PrintArmstrongNo
{ 
  public static void main(String[] args)
  {
    int b=0;
    for(int i=100;i<=500;i++)
    {
     int num=i;

     int digit=num%10;
     b=digit+digit+digit+b;
     num=num/10;
    }
    if(b==num)
    System.out.println(b);
    
  }
}