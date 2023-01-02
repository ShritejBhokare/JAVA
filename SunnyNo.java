import java.util.Scanner;
class SunnyNo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter any number : ");
	    int num=sc.nextInt();
        //int a=num+1;
        int k=num+1;
        int j=0;
	    for(int i=1;i<=(num+1);i++)
	    {
	    	
	    	if(i*i==(num+1)) 
	    	{
	    	 j=i*i;
	    	 System.out.println("Since num+1= "+(num+1)+" it is persect square of "+i);
	    	 break;
	    	}
	    }
	    System.out.print(j==k?+num+" is sunny no":+num+" it is not sunny no");
	
	}  
}