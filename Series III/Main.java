import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=3;
      int b=9;
      int ser=0;
      System.out.print(a+" "+b);
      for(int i=3;i<=n;i++){
          ser=a*b;
         System.out.print(" "+ser);
          b=ser;
          
       
      }
	}
}