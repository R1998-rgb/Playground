import java.util.Scanner;
class Main{
   public static void main(String[] args){
     
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int term=0;
     for(int i=1;i<=n;i++){
       term=(13*i*(i-1)/2)+2;
       System.out.print(term+" ");
     }
   }
}
