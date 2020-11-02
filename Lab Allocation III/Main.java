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
     int n=sc.nextInt();
     
     if((n<=L1)&&(n<=L2)&&(n<=L3)) {
    	 System.out.println("3");
     }
     else if(((n<=L1)&&(n<=L2))|| ((n<=L2)&&(n<=L3)) ||((n<=L1) && (n<=L3))) {
    	 System.out.println("2");
     }
     else if((n<=L1)||(n<=L2)||(n<=L3)) {
    	 System.out.println("1");
     }
     else {
    	 System.out.println("0");
     }

     
    }

}