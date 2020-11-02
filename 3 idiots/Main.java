import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    int x1=sc.nextInt();
    int y1=sc.nextInt();
    int x2=sc.nextInt();
    int y2=sc.nextInt(); 
    float xcor=((float)x1+(float)x2)/2;
      float ycor=((float)y1+(float)y2)/2;
    System.out.println("Binoy's house is located at ("+xcor+","+ycor+")");
  }
}