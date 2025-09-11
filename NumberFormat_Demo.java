class NumberFormat_Demo
{
public static void main(String args[])
{
try
{
int num=Integer.parseInt("sahyadri");   //sahyadri is not integer
System.out.println(num);
}
catch(NumberFormatException e)
{
System.out.println("number format exception");
}
}
}