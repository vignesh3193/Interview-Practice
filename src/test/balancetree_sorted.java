package test;


//using tree structure from tree.java
public class balancetree_sorted {
	
	public static void main(String args[])
	{
		int[] a={1,2,3,4,5,6,7};
	
		node t=CreateBalancedTree(a,0,a.length-1);
		inorder(t);
	
	}
	
	static node CreateBalancedTree(int[] a, int s,int e)
	{	
		if(e<s)
		{
			return null;
		}
		
			int mid=(s+e)/2;
			node n=new node(a[mid]);
			n.left=CreateBalancedTree(a,s,mid-1);
			n.right=CreateBalancedTree(a,mid+1,e);
			return n;
		
	}
	static void inorder(node n)
	{
		if(n!=null)
		{
			inorder(n.left);
			System.out.println(n.value);
			inorder(n.right);	
		}
	}
}
