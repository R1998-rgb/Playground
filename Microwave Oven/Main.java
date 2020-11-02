import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       
       int items=sc.nextInt();
       float time=sc.nextFloat();
       float heating_time=0;
       switch(items) {
       
       case 1:
    	  System.out.println(time);
    	  break;
    	  
       case 2:
    	   heating_time=(float) (time*1.5);
    	   System.out.format("%.2f",heating_time);
    	   break;
       
       case 3:
    	   heating_time=time*2;
    	   System.out.format("%.2f",heating_time);
    	   break;
    	   
    	default:
    		System.out.println("Number of items is more");
    		
    	   
       }
       
       
       
       
       
       
       
       
    }
}
     
     