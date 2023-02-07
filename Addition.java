import java.io.*;
class Addition
{
int n1;
String n2;
void insertRecord(int n,int m)
{
n1=n;
n2=m;
}
void displayInformation()
{
System.out.println(n1+" "+n2);}
}
class Teststudent{
public static void main(String args[])
{
Addition n1=new Additon();
Addition n2=new Addition();
n1.insertRecord(111+345);
n2.insertRecord(222+567);
n1.displayInformation();
n2.displayInformation();
}
}
