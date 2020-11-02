import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=0;
        int c=1 ;
        int sum=0;
      System.out.print(a+" "+b+" "+c+" ");
        for(int i=4;i<=n;i++)
        {
         
          sum=a+b+c;
           System.out.print(sum+" ");
          a=b;
          b=c;
          c=sum;
        }
     
            
       
      
    }
}