import java.util.Scanner;
class IndexOfArray
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int i,n;
System.out.print("Enter the array size:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements in an array");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.println("The elements in an array is:");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}
