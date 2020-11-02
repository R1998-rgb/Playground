import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=(a%10)*100;
    int c=((a/10)%10)*10;
    int d=(a/10)/10;
    int dig=b+c+d;
    System.out.println(dig);
  }
}