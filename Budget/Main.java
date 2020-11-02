import java.util.Scanner;
class Main
{
	public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
       int blast_rifle=sc.nextInt();
       int vis_sensors=sc.nextInt();
       int auditory_sensors=sc.nextInt();
       int arms=sc.nextInt();
       int legs=sc.nextInt();
       
       float br=(float) ((float)blast_rifle*350.34);
       float vs=(float)((float)vis_sensors*230.90);
       float as=(float)((float)auditory_sensors*190.55);
       float ar=(float)((float)arms*125.30);
       float le=(float)((float)legs*180.90);
       
       float sum=br+vs+as+ar+le;
       if(sum>15000) {
    	   System.out.println("No");
       }
       else {
    	   System.out.println("Yes");
       }
    }
}
     
     
     
     
     
     
     
     
     
     
     
     
     
    
