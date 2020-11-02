import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int sum=0;
        
        for(int i=3;i<=n;i++)
        {
         
          sum=a+b;
          a=b;
          b=sum;
        }
      System.out.print(sum);
            
       
      
    }
}