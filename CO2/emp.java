//	Program to create a class for employee having attributes eno, ename, esalary
//	Read n employee information and search for an employee given e_num using the concepts of array of objects

import java.io.*;
import java.util.*;

class employee
{
	int eno;
	String ename;
	double esalary;
	employee(int eno,String ename,double esalary)
	{
		this.eno=eno;
		this.ename=ename;
		this.esalary=esalary;
	}
}

class emp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		employee[] emps=new employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter id number of employee "+(i+1)+":");
			int eno=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name of employee "+(i+1)+":");
			String ename=sc.nextLine();
			System.out.println("Enter salary of employee "+(i+1)+":");
			double esalary=sc.nextDouble();
			emps[i]=new employee(eno,ename,esalary);
		}
		System.out.println("Enter search value:");
		int search=sc.nextInt();
		int flag=0;
		for(int i=0;i<n;i++)
		{
			if(emps[i].eno==search)
			{
				System.out.println("Employee Found!! \nName:"+emps[i].ename+"\nSalary:"+emps[i].esalary);
				flag=0;
				break;
			}
			else
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("Employee not found!!");
		}
	}
}

