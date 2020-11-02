import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String stud_type=sc.nextLine();
        float tut_fee=sc.nextFloat();
        float bus_fee=sc.nextFloat();
        float host_fee=sc.nextFloat();
      float fee=0;
       if(stud_type.contentEquals("MSDS")){
          fee=tut_fee+bus_fee;
          System.out.format("%.2f",fee);
       }
      else if(stud_type.contentEquals("MSH")){
         fee=tut_fee+host_fee;
         System.out.format("%.2f",fee);
      }
      else if(stud_type.contentEquals("MGSDS")){
        tut_fee*=1.5; 
        fee=tut_fee+bus_fee;
          System.out.format("%.2f",fee);
      }
      else if(stud_type.contentEquals("MGSH")){
        tut_fee*=1.5; 
         fee=tut_fee+host_fee;
          System.out.format("%.2f",fee);
      }
      else{
        System.out.println("Invalid");
      }
     
        
      
    }
}