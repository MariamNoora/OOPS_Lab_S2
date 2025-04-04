import java.io.*;
import java.util.*;

class prgm2
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int r1,r2,c1,c2,i,j;
		System.out.println("Enter the size of the first martix:");
		r1=obj.nextInt();
		c1=obj.nextInt();
		System.out.println("Enter the size of the second martix:");
		r2=obj.nextInt();
		c2=obj.nextInt();
		if((r1==r2)&&(c1==c2))
		{
			int a[][]=new int[r1][c1];
			int b[][]=new int[r2][c2];
			int c[][]=new int[r1][c2];
			System.out.println("Enter elements for first martix:");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{
					a[i][j]=obj.nextInt();
				}
			}
			System.out.println("Enter elements for second martix:");
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
				{
					b[i][j]=obj.nextInt();
				}
			}
			System.out.println("Martix addition:");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c2;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
					System.out.print("\t"+c[i][j]);
				}
				System.out.print("\n");
			}
		}
		else
		{
			System.out.println("Martix addition not possible!!! Give same matrix size!!!");
		}
	}
}
