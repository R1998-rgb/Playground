import java.util.Scanner;
class Main
{
    public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
//     System.out.println("L1 seating capacity : ");
     int L1=sc.nextInt();
//     System.out.println("L2 seating capacity : ");
     int L2=sc.nextInt();
//     System.out.println("L3 seating capacity : ");
     int L3=sc.nextInt();
     
//     System.out.println("Allocated: ");
     String allocated=sc.next();
     
     if (allocated.equals("L1"))
     {
       	 if (L2<L3) {
    		System.out.println("L2");
    	}
    	else {
    		System.out.println("L3");
    	}
     }
     
       else if(allocated.equalsIgnoreCase("L2")) {
       		 if (L1<L3) {
         		System.out.println("L1");
         	}
         	else {
         		System.out.println("L3");
         	}
          }
    else {
    	if(L1<L2)
    	{ System.out.println("L1");
    		}
    	else {
    		System.out.println("L2");
    	}
    	}
}
}
    
