import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    int num=sc.nextInt();
    
    int col2,col3,col4,col5,row2;
    
    col2=col*2;
    col3=col*3;
    col4=col*4;
    col5=col*5;
    row2=row*2;
    
    
    if(num>1 && num<=col){
      System.out.println("Yes");
    }
    else if(num==col || num==col2 || num==col3 || num==col4 || num==col5){
      System.out.println("Yes");
    }
    else if(num==(col+1) || num== (col2+1) || num==(col3+1) || num==(col4+1) || num==(col5+1)){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}