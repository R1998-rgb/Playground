import java.util.Scanner;
class Main
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int team=a/b;
  int rem=a%b;
  System.out.println("The number of students in each team is "+team+" and left out is "+rem);
}
}