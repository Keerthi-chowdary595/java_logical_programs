import java.util.Scanner;
class Product
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int pno;
String pname;
float pcost,pqty;
System.out.println("Enter the pno");
sc.nextInt();
System.out.println("Enter the pname");
sc.next();
System.out.println("Enter the pcost");
sc.nextFloat();
System.out.println("Enter the pqty");
sc.nextFloat();
float bill=pcost*pqty;
System.out.println("The given product no is:"+pno);
System.out.println("The given product name is:"+pname);
System.out.println("The given product cost is:"+pcost);
System.out.println("The given product quantity is:"+pqty);
System.out.println("The total bill is:"+bill);
}
}
