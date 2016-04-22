package test;

public class anagram {

	public static void main(String args[])
	{
		String x="ramcan";
		String y="carmasn";
		int[] xused=new int[26];
		int[] yused=new int[26];
		
		
		
		
		if(x.length()!=y.length())
		{
			System.out.println("nope");
		}
		
	
		else
		{
			for(int i=0;i<xused.length;i++)
			{
				xused[i]=0;
				yused[i]=0;
			}
			
			for(int i=0;i<x.length();i++)
			{
				int c=x.charAt(i);
				int c1=y.charAt(i);
				xused[c-97]++;
				yused[c1-97]++;
			}
			
			for(int i=0;i<xused.length;i++)
			{
				if(xused[i]!=yused[i])
				{
					System.out.println("NOPE");
					System.exit(0);
				}
			}
			
			System.out.println("YUS");
		}
	}
}
	
