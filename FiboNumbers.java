package Kamran;
import java.util.Scanner;
public class FiboNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
		odd(n);
		even(n);
		
	}
	
  public static void odd(int n)
  {
	  for(int i=0; i<2*n; i++ )
	  {
		  if(i%2!=0)
		   System.out.print(i +",");
	  }
	
  }
	public static void even(int n)
	{
		for(int i=1; i<2*n; i++)
		{
			if(i%2==0)
				System.out.print(i-1+",");
		}
	}
}