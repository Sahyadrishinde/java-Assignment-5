public class Throws
{
public void display()throws NumberFormatException
{
int a=10;
int b=0;
int c=a/b;
}
public void show()
{
System.out.println("Hii");
}
public static void main(String args[])
{
Throws t=new Throws();
t.display();
t.show();
}
}