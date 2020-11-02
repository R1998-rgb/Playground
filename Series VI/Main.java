import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
    int val=0;
   for(int i=1;i<=n;i++){
     if(i%2 !=0){
      val=(i*i)-1;
       System.out.print(val+" ");
     }
     else{
       val=(i*i)-2;
       System.out.print(val+" ");
     }
   }
  }
}