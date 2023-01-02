class Pattern06
{
	public static void main(String[] args)
	{
		int a=0;
		for (int i=1;i<=5;i++)
        {
        	a=a+i;
        	int b=a;
        	for (int j=1;j<=i;j++) 
        	{
        		System.out.print(b+" ");
        		b--;
        		
        	}
        	System.out.println();
			
		}
	}
}

/*
1
3 2
6 5 4
10 9 8 7
15 14 13 12 11
*/