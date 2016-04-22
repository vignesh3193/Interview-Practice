package test;

public class tree {
	
	public static void main(String args[])
	{
		node tr=new node();
		tr.addtotree(new node(5));
		
	}
}

class node
{
	int value;
	node left;
	node right;
	
	node()
	{
		value=-1;
		left=null;
		right=null;
	}
	

	node(int a)
	{
		value=a;
		left=null;
		right=null;
	}
	
	node(int a, node b,node c)
	{
		value=a;
		left=b;
		right=c;
	}
	
	node(int a,node b)
	{
		value=a;
		left=b;
		right=null;
	}
	
	void addtotree(node z)
	{
		if(this.value==-1)
		{
			this.value=z.value;
			this.left=z.left;
			this.right=z.right;
		}
		if(z.value>this.value)
		{
			this.right=z;
		}
		else
		{
			this.left=z;
		}
	}
}