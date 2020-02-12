import java.util.Scanner;
class Upper
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a char");
char ch=sc.next().charAt(0);
System.out.println((ch==65&&ch==90)?"lower case":"uppercase");
}
}