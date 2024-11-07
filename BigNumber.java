import java.util.Scanner;
class BigNumber
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int a=60,b=30,c=30;
if(a>b)
{
if(a>c)
{
System.out.println("a is big");
}
else
{
System.out.println("b is big");
}
}
else
{
if(b>c)
{
System.out.println("b is big");
}
else
{
System.out.println("c is big");
}
}
}
}