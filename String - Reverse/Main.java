import java.lang.*;
import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    String s=sc.nextLine();
    
    StringBuilder input=new StringBuilder();
    
    input.append(s);
    
    input=input.reverse();
    
    System.out.print(input);
  }
}