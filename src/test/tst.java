package test;

import java.util.Arrays;

public class tst {

	public static void main(String[] args) {
		int[][] a={{1,2},{3,4}};
		int[][] b=new int[2][2];
		
		b=a;
		a[0][0]=0;
		System.out.println(Arrays.toString(b[0]));

	}

}
