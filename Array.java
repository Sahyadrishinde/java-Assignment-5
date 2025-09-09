public class Array {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
System.out.println(arr[2]);
try
{
 System.out.println(arr[6]);//it will show exception as the size of array is 5 (array index out of bound exception)
}
catch(Exception e)
{
System.out.println("it will not execute as the size of array is 5 ");
}
}
}
