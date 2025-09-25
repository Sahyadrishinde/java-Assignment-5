import java.util.*;
public class Valid
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your age:");
int age=sc.nextInt();
if(age<18)
{
System.out.println("you are not valid user");
throw new ArithmeticException("your age is less than 18");
}
else
{
System.out.println("you are valid for votting");
}
System.out.println("press 1.xyz    2.pqr    3.abc");
}
}