package test;
import java.util.*;


public class QusingStack {

	public static void main(String args[])
	{
		
		myQueue x=new myQueue();
		for(int j=1;j<20;j++)
		{
			x.enqueue(j);
		}

		System.out.println(x);
		for(int j=1;j<4;j++)
		{
			x.dequeue();
		}
		System.out.println(x);
	}
}

class myQueue
{
	Stack<Integer> a=new Stack<Integer>();
	Stack<Integer> b=new Stack<Integer>();


	void enqueue(int x)
	{
		a.push(x);
	}


	void dequeue()
	{	
		if(a.size()==0)
		{
			System.out.println("its empty bruh");
		}
		else
		{
			
			while(a.size()>0)
			{  //System.out.println(i);
				int temp=a.pop();
				b.push(temp);
			}
			b.pop();
			//System.out.println("a"+a);
			//System.out.println("b"+b);
			
			while(b.size()>0)
			{
				int temp=b.pop();
				a.push(temp);
			}
		}
	}

	public String toString()
	{
		return a.toString();
	}
}

