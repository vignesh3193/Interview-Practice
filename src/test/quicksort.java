package test;

public class quicksort {
	
	public static void main(String args[])
	{
		int[] a={1,5,3,6,2,6,34,1,634};
		
		QuickSort(a,0,a.length-1);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	
	static void QuickSort(int[] a, int p,int r)
	{
		
		if(p<r)
		{
		int pivot=partition(a,p,r);
		QuickSort(a,p,pivot-1);
		QuickSort(a,pivot+1,r);
		}
	}
	
	static int partition(int[] a,int p, int r)
	{	
		int i=p-1,temp;
		for(int j=p;j<r;j++)
		{
			if(a[j]<=a[r])
			{
				i++;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}			
		}
		i++;
		temp=a[i];
		a[i]=a[r];
		a[r]=temp;
		
		return i;
	}
}
