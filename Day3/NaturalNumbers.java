import java.util.Scanner;
class SumOfNaturalNumbers
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int i=1,n,sum=0;
System.out.print("Enter the value of n");
n=sc.nextInt();
while(i<=n)
{
sum=sum+i;
i++;
System.out.println("The value of sum is:"+sum);
}
}
}
