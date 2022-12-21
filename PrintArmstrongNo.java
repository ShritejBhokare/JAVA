public class armstrong 
{
  public static void main(String[] args)
 {
  for(int a=100;a<=999;a++)
   {
    int s=0;
    int b=a;
    while(b>0)
     {
	int digit=b%10;
	s=s+digit*digit*digit;
	b=b/10;
     }
			
	if(s==a)
	System.out.println("armstrong numbers are "+a);
     }

 }

}
