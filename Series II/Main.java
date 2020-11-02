import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=6;
    int sum=5;
    for(int i=1;i<=n;i++){
       System.out.print(a+" ");
      a=a+sum;
      sum+=5;
    
    }
      
  }
}