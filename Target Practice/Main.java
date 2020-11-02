import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int target=sc.nextInt();
   int n1=sc.nextInt();
   int sum=n1;
   int turn=1;
   while(sum<target){
      n1=sc.nextInt();
      sum+=n1;
      turn++;
  }
    System.out.println("The number of turns is "+turn);
    
}
}