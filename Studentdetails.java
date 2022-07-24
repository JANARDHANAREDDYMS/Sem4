package lab1a;
import java.util.*;
public class Studentdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n=input.nextInt();
		student s[]=new student[n];
		for(int i=0;i<n;i++)
		{
			s[i]= new student();
			s[i].read();
		}
		System.out.printf("%-20s%-20s%-20s%-20s","USN","Name","Branch","Phone");
		for(int i=0;i<n;i++)
		{
			s[i].display();
		}
		input.close();
	}

}
