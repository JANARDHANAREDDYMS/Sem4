package lab1b;
import java.util.*;
public class arraystack {
	int MAX,top;
	int arr[];
	arraystack(int n)
	{
		MAX=n;
		top=-1;
		arr=new int[MAX];
	}
	void push(int e)
	{
		if(top==MAX-1)
		{
			System.out.println("Stack overflow");
		}
		else
			arr[++top]=e;
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow");
		}
		else
		{
			int temp=0;
			temp=arr[top--];
			System.out.println("Popped element is "+temp);
		}
	}
	void display()
	{
		System.out.print("Stack = ");
		if(top==-1)
		{
			System.out.println("Empty");
			return;
		}
		for(int i=top;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
