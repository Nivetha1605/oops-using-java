
import java.io.*; 
import java.util.*;
 public class B {
 public static void main(String args[])
 { 
Scanner a=new Scanner(System.in);
 System.out.println("Enter the year");
 int x=a.nextInt();
 if(x%4==0) 
{
 System.out.println(x+ "is an leap year");
 }
 else
 {
 System.out.println(x+ "is an not leap year");
 }
 }
 }
