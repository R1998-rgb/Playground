import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    int a=121;
    int b=11;
    System.out.print(a);
    for(int i=2;i<=n;i++){
      b+=4;
     int c=b*b;
      System.out.print(" "+c);
    }
  }
}