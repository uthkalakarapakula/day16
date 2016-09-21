import java.lang.*;
import java.util.*;
public class TestSample1{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter x&y values");
int x=sc.nextInt();
int y=sc.nextInt();
Sample1 obj=new Sample1();
boolean b=obj.sameLast(20,19);
if(x>10&&y<20)
{
System.out.println(x+","+y+"---->"+true);
}
else
{
System.out.println(x+","+y+"---->"+false);
}
}
}