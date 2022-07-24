package lab1a;
import java.util.*;
public class student {
	String usn,name,branch,phone;
	Scanner input=new Scanner(System.in);
	void read()
	{
		System.out.println("Enter student details");
		System.out.println("Enter USN");
		usn=input.nextLine();
		System.out.println("Enter Name");
		name=input.nextLine();
		System.out.println("Enter Branch");
		branch=input.nextLine();
		System.out.println("Enter phone number");
		phone=input.nextLine();
	}
	void display()
	{
		System.out.println();
		System.out.printf("%-20s%-20s%-20s%-20s",usn,name,branch,phone);
	}
}
