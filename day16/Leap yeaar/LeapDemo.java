import java.lang.*;
import java.util.*;
public class LeapDemo
{
public static void main(String args[]) 
{
Scanner sc=new Scanner(System.in);
    System.out.println("Enter the lowest year: ");
int min_year=sc.nextInt();
     System.out.println("Enter the heighest year: ");
int max_year=sc.nextInt();
   System.out.println("Leap years in given range are: ");
int year=sc.nextInt();
    for(year = min_year;year <= max_year; year++)
{
if(((year%4==0)&&(year%100!=0))||(year%400==0))
             System.out.println("years="+year);
    }
}
}