import java.util.Scanner;
class Main
{
   
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
//      System.out.println("Enter birth year : ");
      int birth_year=sc.nextInt();
//      System.out.println("Enter current  year : ");
      int current_year=sc.nextInt();
      int age = 0;
      if(current_year<birth_year) {
    	  age=(current_year+100)-birth_year;
          System.out.println(age);
      }
      else {
    	  age=current_year-birth_year;
    	  System.out.println(age);
      }
     
    }
    
}