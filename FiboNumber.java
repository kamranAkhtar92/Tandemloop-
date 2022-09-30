package Kamran;
import java.util.Scanner;
public class FiboNumber {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the value of n");
  int n=sc.nextInt();
  for(int i=0; i<2*n; i++)
  {
   if(i%2!=0)
   System.out.print(i+",");
  }
  
 }
}