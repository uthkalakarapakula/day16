import java.lang.*;
import java.util.*;
public class TestSolution{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter x&y values");
int x=sc.nextInt();
int y=sc.nextInt();
Solution1 obj=new Solution1();
boolean b=obj.sameLast(25,35);
if(x%10==y%10)
{
System.out.println(x+","+y+"---->"+true);
}
else
{
System.out.println(x+","+y+"---->"+false);
}
}
}