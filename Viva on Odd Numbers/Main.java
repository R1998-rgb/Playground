import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    float score=0;
    int n1=0;
    do{
      int n=sc.nextInt();
      if(n%2!=0 && n>0){
        score+=1;
        n1=n1+1;
      }
      else if(n%2==0&&n>0){
        score-=0.5;
      }
      else if(n<0){
        score-=1;
       break;
      }
    } while(n1<3);
      
      System.out.println(score);
        
  }
}