import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        float b=2;
      System.out.print(a+" "+b+" ");
        float val=0;
      for(int i=3;i<=n;i++){
        if(i%2!=0){
          a*=3;
          val=a;
          System.out.print(val+" ");
        }
        else{
          b*=3;
          val=b;
          System.out.print(val+" ");
        }
      }
          
	}
}