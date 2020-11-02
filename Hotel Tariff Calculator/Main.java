import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        float rent=sc.nextFloat();
        int days=sc.nextInt();
        float tariff=0;
        switch(month){
          case 1:
            tariff=rent*days;
              System.out.format("%.2f",tariff);
            break;
          case 2:
            tariff=rent*days;
             System.out.format("%.2f",tariff);
            break;
          case 3:
            tariff=rent*days;
               System.out.format("%.2f",tariff);
            break;
          case 4:
            rent*=1.2;
             tariff=rent*days;
              System.out.format("%.2f",tariff);
            break;
          case 5:
            rent*=1.2;
            tariff=rent*days;
               System.out.format("%.2f",tariff);
            break;
          case 6:
            rent*=1.2;
            tariff=rent*days;
              System.out.format("%.2f",tariff);
            break;
          case 7:
             tariff=rent*days;
              System.out.format("%.2f",tariff);
            break;
          case 8:
             tariff=rent*days;
             System.out.format("%.2f",tariff);
            break;
          case 9:
             tariff=rent*days;
              System.out.format("%.2f",tariff);
            break;
          case 10:
             tariff=rent*days;
            System.out.format("%.2f",tariff);
            break;
          case 11:
            rent*=1.2;
            tariff=rent*days;
              System.out.format("%.2f",tariff);
            break;
          case 12:
            rent*=1.2;
            tariff=rent*days;
             System.out.format("%.2f",tariff);
            break;
          default:
            System.out.println("Invalid Input");
        }
            
            
            
            
            
	}
}