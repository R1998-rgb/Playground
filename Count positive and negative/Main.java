import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int pos=0,neg=0;
      
      for(int i=1;i<=a;i++){
        int b=sc.nextInt();
        
        if(b>0 && b!=0){
          pos+=1;
        }
        
         else if(b<0 && b!=0){
          neg+=1;
        }
      }
      System.out.println("Number of positive numbers is "+pos+" and the number of negative numbers is "+neg);      
    }
}