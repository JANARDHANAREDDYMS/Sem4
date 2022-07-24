import java.util.*;
public class Mergesort {
	static final int MAX=10005;
	static int a[]= new int[MAX];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the max array size");
		int n=input.nextInt();
		Random random=new Random();
		for(int i=0;i<n;i++)
		{
			a[i]=random.nextInt(1000);
			
		}
		Mergesortalgo(0,n-1);
		long startTime=System.nanoTime();
		Mergesortalgo(0,n-1);
		long stopTime=System.nanoTime();
		long elapsedTime=stopTime-startTime;
		System.out.println("Time complexity for n="+n+" in ms is : "+(double)elapsedTime/1000000);
		input.close();
		}
	public static void Mergesortalgo(int p, int r)
	{
		int mid;
		if(p<r)
		{
			mid=(p+r)/2;
			Mergesortalgo(p,mid);
			Mergesortalgo(mid+1,r);
			Merge(p,mid,r);
		}
	}
	public static void Merge(int low,int mid,int high)
	{
		int b[]=new int[MAX];
		int i,j,k,h;
		i=h=low;
		j=mid+1;
		while(h<=mid && j<=high)
		{
			if(a[h]<a[j])
			{
				b[i++]=a[h++];
			}
			else
				b[i++]=a[j++];
		}
		if(h>mid)
		{
			for(k=j;k<=high;k++)
				b[i++]=a[k];
		}
		else
		{
			for(k=i;k<=mid;k++)
				b[i++]=a[k];
		}
		for(k=low;k<high;k++)
		{
			a[k]=b[k];
		}
	}
}
