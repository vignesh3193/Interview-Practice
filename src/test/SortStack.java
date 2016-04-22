package test;

import java.util.*;

public class SortStack {
	
	public static void main(String args[])
	{	
		int count;
		Random rand=new Random();
		Stack<Integer> unsort=new Stack<Integer>();
		Stack<Integer> sort=new Stack<Integer>();
		
		
		for(int j=1;j<20;j++)
		{
			unsort.push(rand.nextInt(20));
		
		}
		
		System.out.println(unsort);
		
		while(unsort.size()>0)
		{	count=0;
			int temp=unsort.pop();
			
			if(sort.size()==0||temp>=sort.peek())
			{
				sort.push(temp);
			}
			else
			{
				while(!sort.isEmpty()&&sort.peek()>temp)
				{
					unsort.push(sort.pop());
					count++;
				}
				
				sort.push(temp);
				
				for(int i=0;i<count;i++)
				{
					sort.push(unsort.pop());
				}
			}
		}
		
		
		System.out.println(sort);
		
		
	}

}
