package test;
public class replace_spaces {

	public static void main(String args[])
	{
		String x="just a sentence with some spaces";
		String y="";

		for(int i=0;i<x.length();i++)
		{
			if(x.charAt(i)!=' ')
			{
				y+=x.charAt(i);
			}
			else
			{
				y+="%20";
			}
		}
		System.out.println(y);
	}
}
