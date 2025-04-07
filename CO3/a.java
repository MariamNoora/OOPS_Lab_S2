/*	
Created a class person with data members name, gender, address, age and a constructor to initialize the data members.

And another class employee that inherits the properties of class person and also contains its own data members like empID, compName, qualification, salary and its own constructor.

Create another class teacher that inherits the properties of class employee and contain its own data members like subject, department, teacherID and also contains constructors and methods to display data members.

Use array of objects to display details of n teachers.
*/

import java.io.*;
import java.util.*;

class person
{
	String name;
	String gender;
	String address;
	int age;
	person(String name,String gender,String address,int age)
	{
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
	}
}

class employee extends person
{
	int empID;
	String compName;
	String qualif;
	int salary;
	employee(String name,String gender,String address,int age,int empID,String compName,String qualif,int salary)
	{
		super(name,gender,address,age);
		this.empID=empID;
		this.compName=compName;
		this.qualif=qualif;
		this.salary=salary;
	}
}

class teacher extends employee
{
	String subject;
	String dept;
	int tID;
	teacher(String name,String gender,String address,int age,int empID,String compName,String qualif,int salary,String subject,String dept,int tID)
	{
		super(name,gender,address,age,empID,compName,qualif,salary);
		this.subject=subject;
		this.dept=dept;
		this.tID=tID;
	}
	void display()
	{
		System.out.println("\n_____________\nTEACHER DETAILS\n_____________");
		System.out.println("Name:\t"+name);
		System.out.println("gender:\t"+gender);
		System.out.println("address:\t"+address);
		System.out.println("age:\t"+age);
		System.out.println("empID:\t"+empID);
		System.out.println("compName:\t"+compName);
		System.out.println("qualif:\t"+qualif);
		System.out.println("salary:\t"+salary);
		System.out.println("subject:\t"+subject);
		System.out.println("dept:\t"+dept);
		System.out.println("tID:\t"+tID);
		
	}
}

class a
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		teacher[] te=new teacher[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("ENTER TEACHER "+(i+1)+" DETAILS:");
			System.out.println("Enter name:");
			String name=sc.next();
			System.out.println("Enter gender:");
			String gender=sc.next();
			System.out.println("Enter address:");
			String address=sc.next();
			System.out.println("Enter age:");
			int age=sc.nextInt();
			System.out.println("Enter empID:");
			int empID=sc.nextInt();
			System.out.println("Enter compName:");
			String compName=sc.next();
			System.out.println("Enter qualif:");
			String qualif=sc.next();
			System.out.println("Enter salary:");
			int salary=sc.nextInt();
			System.out.println("Enter subject:");
			String subject=sc.next();
			System.out.println("Enter dept:");
			String dept=sc.next();
			System.out.println("Enter tID:");
			int tID=sc.nextInt();			
			te[i]=new teacher(name,gender,address,age,empID,compName,qualif,salary,subject,dept,tID);
		}
		for(int i=0;i<n;i++)
		{
			te[i].display();
		}
	}
}







