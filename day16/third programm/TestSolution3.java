import java.util.*;
import java.io.*;
public class TestSolution3{
public static void main(String args[])
{
 int count = 0;
int sum = 0;
Scanner sc=new Scanner(System.in);
System.out.println("enter num1,num2 values");
int num1=sc.nextInt();
int num2=sc.nextInt();
Solution3 obj=new Solution3();
 for (int i = num1; i <= num2; i++)
    {
  if ((i % 13 == 0) && (i%15==0)&& (i%17==0) && (!(i%30==0)))
{
      System.out.println(i);
            count++;
            sum = sum + i;
System.out.println(num1+","+num2+"---->"+true);
}
else
{
System.out.println(num1+","+num2+"---->"+false);
}
}
}
}
