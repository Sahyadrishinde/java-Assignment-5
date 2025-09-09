public class DemoTest5
{
public static void main(String args[])
{
int a,b,c,d,e;
a=10;
b=0;
e=a-b;
System.out.println("Substraction is :"+e);
try
{
c=a/b;
System.out.println("Division is :"+c);
}
catch(ArithmeticException p)
{
System.out.println("we cannot divide by zero");
}
d=a+b;
System.out.println("Addition is :"+d);
}
}