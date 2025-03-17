//define a cls 'product' with data members 'pcode','pname' and 'price'.
//create 3 objects of the class and find the product having lowest price

import java.io.*;
import java.util.*;

class product
{
	int pcode;
	String pname;
	double price;
	void data(int a,String b,double c)
	{
		pcode=a;
		pname=b;
		price=c;
	}
	void display()
	{
		System.out.println(pcode+"\t"+pname+"\t"+price);
	}
	static void findlowest(double p1,double p2,double p3)
	{
		if(p1<p2)
		{
			if(p1<p3)
			{
				System.out.println("The first price is the lowest");
			}
			else
			{
				System.out.println("The third price is the lowest");
			}
		}
		else
		{
			if(p2<p3)
			{
				System.out.println("The second price is the lowest");
			}
			else
			{
				System.out.println("The third price is the lowest");
			}
		}
	}
}

class prgm1
{
	public static void main(String args[])
	{
		product ob1=new product();
		product ob2=new product();
		product ob3=new product();
		ob1.data(101,"A",53.45);
		ob2.data(102,"B",25.21);
		ob3.data(103,"C",33.04);
		ob1.display();
		ob2.display();
		ob3.display();
		
		product.findlowest(ob1.price,ob2.price,ob3.price);
		
	}
}

