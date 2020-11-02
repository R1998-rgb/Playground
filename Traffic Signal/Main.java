import java.util.Scanner;
class Main
{
	public static void main(String args[])
	 {
       Scanner sc=new Scanner(System.in);
       
       float mil_hour=sc.nextFloat();
       float distance=sc.nextFloat();
       float time=sc.nextFloat();
       
       float conv=time/(60*60);
       
       float speed=distance/conv;
       
       if(speed<mil_hour) {
    	   System.out.println("Yes");
       }
       
       else {
    	   System.out.println("No");
       }
       
       
       
       
       
       
       
       
    }
}
     
   