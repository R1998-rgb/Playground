import java.util.Scanner;

class Main
{
  
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float st1=sc.nextFloat();
        float st2=sc.nextFloat();
        float st3=sc.nextFloat();
        float st4=sc.nextFloat();
        float st5=sc.nextFloat();
      
      float avg=((st1+st2+st3+st4+st5)/5);
     System.out.format("%.2f", avg);
       
    }
}