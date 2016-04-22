package test;
public class hash {
	
	public static void main(String args[])
	{
	
	
		hashmap h=new hashmap();
		
		h.add("abc", 1);
		h.add("abcD", 11);
		h.add("bc", 21);
		h.add("abSc", 14);
		
		System.out.println(h);
		
		h.add("abc", 4);
		
		System.out.println(h);
		
		
	}
}

class hashentry
{
	String key;
	int value;
	
	hashentry(String k,int v)
	{
		this.key=k;
		this.value=v;		
	}
	
	public String toString()
	{
		return "("+this.key+","+this.value+")  ";
	}
}
class hashmap
{
	hashentry[] h;
	
	public hashmap()
	{
		h=new hashentry[10];
		for(int i=0;i<h.length;i++)
		{
			h[i]=null;
		}
	}
	
	
	void add(String k,int v)
	{
		int index=0;
		while(h[index]!=null&&index<h.length-1&&!h[index].key.equals(k))
		{
			if(h[index].key.equals(k))
			{
				System.out.println("key already exists, value updated");
			}
			index++;
		}
		h[index]=new hashentry(k,v);
		
	}
	
	int get(String k)
	{	
		for(int i=0;i<h.length;i++)
		{
			if(h[i].key.equals(k))
			{
				return h[i].value;
			}
		}
		System.out.println("not found");
		return -1;
		
	}
	
	public String toString()
	{	int x=0;
		String ret="";
		for(x=0;x<h.length;x++)
		{
			ret+=h[x];
		}
		return ret;
	}
	
}