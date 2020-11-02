import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int dig1=num%10;
      int temp1=num/10;
      int dig2=temp1%10;
      int temp2=temp1/10;
      if(temp2>0 && temp2<10){
        if((dig2%3==0)&& (dig2 !=0)){
       System.out.println("Trendy Number");
        }
        else{
           System.out.println("Not a Trendy Number");
      }
      }
      else{
        System.out.println("Not a Trendy Number");
        }
      
    }
}