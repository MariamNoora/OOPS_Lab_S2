import java.io.*;
import java.util.*;

class symmetric
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int r1,c1,i,j;
		int flag=0;
		System.out.println("Enter the size of the martix:");
		r1=obj.nextInt();
		c1=obj.nextInt();
		if(r1==c1)
		{
			int a[][]=new int[r1][c1];
			System.out.println("Enter elements for the martix:");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{
					a[i][j]=obj.nextInt();
				}
			}
			System.out.println("The martix:");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{
					System.out.print("\t"+a[i][j]);
				}
				System.out.print("\n");
			}
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{
					if(a[i][j]!=a[j][i])
					{
						flag=1;
						break;
					}
				}
			}
			if(flag==0)
			{
				System.out.println("The martix is symmetric");
			}
			else
			{
				System.out.println("The martix not is symmetric");
			}
			
		}
		else
		{
			System.out.println("Not a square matrix. Only square matrices can be symmetric");
		}
	}
}
