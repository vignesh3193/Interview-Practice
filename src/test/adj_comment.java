package test;

import java.io.*;
import java.util.*;

public class adj_comment {

	public static void main(String args[])throws IOException
	{
		File file=new File("test.txt");
		String comment="adding a \n multiline comment";
		int count;
		int flag;
		String target="just checking the string";
		String newfile="";
		String[] targets=comment.split("\n");
		
		
		Scanner sc=new Scanner(file);
		flag=0;
		count=0;
		while(sc.hasNextLine())
		{	
			
		
			
			String line=sc.nextLine();
			if(line.equals(target))
			{	
				System.out.println("found");
				flag=1;
				line+=" "+targets[count];
				newfile+=line+"\n";
				count++;
			}
			else
			{
				if(flag==1)
				{
					line+=" "+targets[count];
					count++;
				}
				newfile+=line+"\n";
				
			}
			
			if(count==targets.length)
			{
				count=0;
				flag=0;
			}
			
		
		}
		FileWriter wr=new FileWriter(file);
		wr.write(newfile);
		sc.close();
		wr.close();
	}	
	
}
