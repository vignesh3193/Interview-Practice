package test;
import java.io.*;
import java.util.*;

public class duplicates_file {

	public static void main(String args[])throws IOException
	{
		
		File file=new File("test.txt");
		FileWriter writer=new FileWriter(file);
		writer.write("just checking the string\n maybe it has duplicates \n maybe not \njust checking the string");
		writer.close();
		
		Scanner sc=new Scanner(file);
		Hashtable<String,Boolean> check=new Hashtable<String,Boolean>();	
		String line="";
		
		
		
		while(sc.hasNext())
		{
			line=sc.nextLine();
			if(check.containsKey(line))
			{
				System.out.println("duplicate fam");
			}
			check.put(line, true);
			
		}
		System.out.println("no mo fam");
	}
	public enum state{ a,b,c};
}

