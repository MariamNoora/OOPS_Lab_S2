import java.io.*;
import java.util.*;

class strmanip
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i;
		String a,b,c;
		System.out.println("Enter a string:");
		a=s.next();
		System.out.println("Enter another string:");
		b=s.next();
		c=a+" "+b;
		
		System.out.println("Length of 1st String: "+a.length());
		System.out.println("Length of 2st String: "+b.length());
		System.out.println("Concatination of Strings: "+c);
		
		System.out.println("Character at position 5 of "+c+": "+c.charAt(5));
		System.out.println("Comparison of Strings: "+a.compareTo(b));
		System.out.println("Last index of 's' is: "+c.lastIndexOf('s'));
		System.out.println("Ends with character 'r': "+c.endsWith("r"));
		System.out.println("Conversion to uppercase: "+c.toUpperCase());
		System.out.println("Conversion to lowercase: "+c.toLowerCase());
		
		/*System.out.println("Reverse:"+strrev(c)); 	---mistake
				 OR
		for(i=c.length()-1;i>=0;i--)
		{
			System.out.print(c.charAt(i));
		}
		System.out.println("\n");*/
	}
}
