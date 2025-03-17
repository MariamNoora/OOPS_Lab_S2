//create a class CPU with attribute price
//create an inner class processor(no_of_cores,manufacturer) and static nested class RAM(memory,manufacturer)
//create an object of CPU and print info of processor and RAM

import java.io.*;
import java.util.*;

class cpu
{
	int price;
	cpu(int price)
	{
		this.price=price;
	}
	class Processor
	{
		int cores;
		String Manufacturer;
		Processor(int cores,String Manufacturer)
		{
			this.cores=cores;
			this.Manufacturer=Manufacturer;
		}
		void display()
		{
			System.out.println("Number of cores:"+cores);
			System.out.println("Manufacturer of processor:"+Manufacturer);
		}
	}
	static class RAM
	{
		int memory;
		String Manufacturer;
		RAM(int mem,String m)
		{
			memory=mem;
			Manufacturer=m;
		}
		void display()
		{
			System.out.println("Memory:"+memory);
			System.out.println("Manufacturer of RAM:"+Manufacturer);
		}
	}
	void display()
	{
		System.out.println("Price of CPU:"+price);
	}
}

class prjct_cpu
{
	public static void main(String args[])
	{
		cpu obj=new cpu(1343400);
		cpu.Processor pro=obj.new Processor(3,"Intel");
		cpu.RAM rm=new cpu.RAM(64,"HP");
		obj.display();
		pro.display();
		rm.display();
	}
}
