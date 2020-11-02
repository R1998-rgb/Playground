import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a/100;
        int ca=a%10;
        int ans=temp+ca;
       System.out.println(ans);
	}
}