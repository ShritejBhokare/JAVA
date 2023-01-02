class Pattern03
{
 public static void main(String args[])
 {
  int value=1;
  for(int i=1;i<=5;i++)               //5=no.of Rows
  {
   for(int j=1;j<=i;j++)             //j=no.of columns
   {
    System.out.print(value+" ");
    value++;
   }
   System.out.println();
  }
 }
}



/*1
2 3
4 5 6
7 8 9 10
11 12 13 14 15*/