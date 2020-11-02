import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i=1;
      while(i<=n){
        int term=i*i;
        System.out.print(term+" ");
        i+=1;
      }
	}
}