import java.util.Scanner;
import java.util.Arrays;

class SortArray
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter a number you wat to store in array : ");
   int n=sc.nextInt();
   
   int array[]=new int[n];
   System.out.println("Enter the elements in array ");
   for(int i=0; i<n; i++)
   {
    array[i]=sc.nextInt();
   }

   System.out.println("elements in array are :");
    
/* for(int i=0; i<n; i++)
   {
    System.out.println(array[i]); 
   } 
*/
   System.out.println(Arrays.toString(array));
   
   
   Arrays.sort(array);    // use for sorting array



   System.out.println("Sorted Elements in array are in asending order ");
/* for(int i=0; i<n; i++)
   {
    System.out.println(array[i]); 
   } 
*/
   System.out.println(Arrays.toString(array));
   
 }
}

