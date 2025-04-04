import java.io.*;
import java.util.*;

class cmplx
{
	int r;
	int c;
	cmplx(int r1,int c1)
	{
		r=r1;
		c=c1;
	}
	void display()
	{
		System.out.println("The complex number: "+r+" + i"+c);
	}
	static void add(int a, int b, int x, int y)
	{
		int re=a+x;
		int co=b+y;
		System.out.println("The sum of two complex numbers: "+re+" + i"+co);
	}
}
class complex
{
	public static void main(String args[])
	{
		cmplx ob1=new cmplx(2,5);
		cmplx ob2=new cmplx(3,4);
		ob1.display();
		ob2.display();
		cmplx.add(ob1.r,ob1.c,ob2.r,ob2.c);
	}
}
