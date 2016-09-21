import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Leap_Ex3 {
 
	int year1, year2;
	Scanner scan;
	List<Integer> list;
	
	void getVal() {
		
		scan = new Scanner(System.in);
 
		System.out.println("Find number of leap years between two years");
		
		System.out.println("\nEnter the year - 1 : ");
		year1 = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter the year - 2 : ");
		year2 = Integer.parseInt(scan.nextLine());
	}
	
	void check() {
		
		list = new ArrayList<Integer> ();
				
		for(int i=year1; i<=year2; i++) {
			
			if(i%400 == 0 || i%4 == 0) {
				
				list.add(i);			
			}
		}
		
		System.out.println("\nThe Total number of year is : " + list.size());
	}
}

 

