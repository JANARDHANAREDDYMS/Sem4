package quicksort;
import java.util.*;
public class quicksort {
	static final int MAX=10005;
	static int a[]= new int[MAX];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter max array size");
		int n=input.nextInt();
		Random random=new Random();
		for(int i=0;i<n;i++)
		{
			a[i]=random.nextInt(1000);
		}
		a=Arrays.copyOf(a, n);
		Arrays.sort(a);
		Quicksortalgo(0,n-1);
		long startTime=System.nanoTime();
		Quicksortalgo(0,n-1);
		long stopTime=System.nanoTime();
		long elapsedTime=stopTime-startTime;
		System.out.println("Time complexity for n="+n+" in ms is : "+(double)elapsedTime/1000000);
		
	}
	public static void Quicksortalgo(int p,int r)
	{
		int pivot,i,j,temp=0;
		if(p<r)
		{
			pivot=a[p];
			i=p;
			j=r+1;
			while(true)
			{
				i++;
				while(a[i]<pivot && i<r)
				{
					i++;
				}
				j--;
				while(a[j]>pivot)
				{
					j--;
				}
				if(i<j)
				{
					a[i]=temp;
					temp=a[j];
					a[j]=a[i];
				}
				else
				{
					break;
				}
			}
			a[p]=a[j];
			a[j]=pivot;
			Quicksortalgo(p,j-1);
			Quicksortalgo(j+1,r);
		}
	}
}
