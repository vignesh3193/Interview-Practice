package test;

import java.util.ArrayList;
import java.util.Arrays;

public class string_permutations {

	public static void main(String args[])
	{
		String a="abcda";
		
		ArrayList<String>per=perm(a);
		
		for(String b:per)
		{
			System.out.println(b);
		}
		
	}
	

	public static ArrayList<String> perm(String a)
	{
		ArrayList<String> ret=new ArrayList<String>();
		
		if(a.length()==1)
		{
			ret.add(a);
			return ret;
		}
		else
		{	ArrayList<String> ret1=new ArrayList<String>();
			ret1=perm(a.substring(1));
			char temp=a.charAt(0);
			for(String s:ret1)
			{	
				//ret.add(a+s);
				for(int i=0;i<s.length()+1;i++)
				{
					String temp1=s.substring(0,i)+temp+s.substring(i);
					ret.add(temp1);
				}
			//	ret.add(s+a);
			}
			return ret;
		}
	}
}
