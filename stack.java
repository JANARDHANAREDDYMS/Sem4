package lab1b;
import java.util.*;
public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the stack");
		int n=input.nextInt();
		arraystack stk=new arraystack(n);
		boolean done=false;
		do
		{
			System.out.println("Stack operations");
			System.out.println("1.Push\t2.Pop\t3.Display\t4.Exit");
			int choice=input.nextInt();
			switch(choice)
			{
			case 1 : System.out.println("Enter the element to be pushed");
						stk.push(input.nextInt());
						break;
			case 2 : stk.pop();
						break;
			case 3 : stk.display();
						break;
			case 4 : done=true;
						break;
			default : System.out.println("Invalid choice");
			
			}
		}while(!done);
	}

}
