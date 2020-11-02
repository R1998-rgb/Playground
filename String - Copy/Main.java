import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         String str=String.copyValueOf(s.toCharArray());
         System.out.print(str);
	}
}