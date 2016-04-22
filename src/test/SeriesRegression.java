package test;

import java.util.*;
import java.io.*;

public class SeriesRegression {

	public static void main(String[] args)throws IOException {
		
		
		HashMap<String,reg> series=new HashMap<String,reg>();
		
		
		File file=new File("input.txt");
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine())
		{
			String line=sc.nextLine();
			String[] line_array=line.split(" +");
			
			if(series.containsKey(line_array[0]))
			{
				series.get(line_array[0]).a.add(Double.parseDouble(line_array[1]));
				series.get(line_array[0]).b.add(Double.parseDouble(line_array[2]));
			}
			else
			{
				ArrayList<Double> temp1= new ArrayList<Double>();
				ArrayList<Double> temp2= new ArrayList<Double>();
				
				temp1.add(Double.parseDouble(line_array[1]));
				temp2.add(Double.parseDouble(line_array[2]));
				series.put(line_array[0], new reg(temp1,temp2));
			}
			
		}
		sc.close();
		
		/*reg ba=series.get("SERIESB");
		
		for(int i=0;i<ba.a.size();i++)
		{
			System.out.println(ba.a.get(i));
		}*/
		
		for(String name:series.keySet())
		{
			LinearRegression(name, series.get(name));
		}

	}

	static class reg
	{
		ArrayList<Double> a=new ArrayList<Double>();
		ArrayList<Double> b=new ArrayList<Double>();
		
		public reg(ArrayList<Double> A, ArrayList<Double> B)
		{
			a=A;
			b=B;
		}
	}
	
	public static void LinearRegression(String series_name, reg pair)
	{
		ArrayList<Double> x=pair.a;
		ArrayList<Double> y=pair.b;
		
		double xsum=0.0;
		double ysum=0.0;
		double xsqsum=0.0;
		int N=x.size();
		
		for(int i=0;i<N;i++)
		{
			xsum+=x.get(i);
			ysum+=y.get(i);
			xsqsum+= (x.get(i)*x.get(i));
		}
		
		double xbar=xsum/N;
		double ybar=ysum/N;
		
		double x2bar=0.0;
		double y2bar=0.0;
		double xybar=0.0;
		
		for(int i=0;i<N;i++)
		{
			x2bar+= (x.get(i)-xbar)*(x.get(i)-xbar);
			y2bar+= (y.get(i)-ybar)*(y.get(i)-ybar);
			xybar+= (x.get(i)-xbar)*(y.get(i)-ybar);
		}
		
		double m=xybar/x2bar;
		double c=ybar-(m*xbar);
		
		double diff=0.0;
		
		for(int i=0;i<N;i++)
		{
			double fit=m*x.get(i)+c;
			diff+=(fit-ybar)*(fit-ybar);
		}
		
		double R2=diff/y2bar;
		String regression_eqn="y="+m+"x + "+c;
		
		System.out.println("Equation:- " +regression_eqn+"      R^2 :- "+R2 );
		
	}
}
