package Stock;
import java.util.Scanner;
import java.util.*;


 class Library {


	void Java(int c)
	{
		int i = 100;
		if (i>c)
		{
			i=i-c;
			
			System.out.println("Java book is Issued");
			System.out.println("Java Book Avaibility:- "+i);
		}
		else{
			System.out.println("Java Book not available");
		}
	}
	
	void Database(int c)
	{
		int d = 50;
		if (d>c)
		{
			d=d-c;
			
			System.out.println(" Database book is Issued.");
			System.out.println("Database Book Availability:- "+d);
		}
		else{
			System.out.println("Database book not available.");
		}
	}
	
	void Architecture(int c)
	{
		int a = 20;
		if (a>=c)
		{
			a=a-c;
			
			System.out.println(" Architecture Book is Issued .");
			System.out.println("Architecture Book Availability:- "+a);
		}
		else{
			System.out.println("Architecture Book not available.");
		}
	}
	void book (int c) {
		
		int f=100;
		if(f==c)
		{
			System.out.println("Stock is Completed, Cannot add a book for now");
		}
		else {
			System.out.println("Java Book sucessfully added");
		}
	}
	void book1 (int c) {
			int g=50;
			if (g==c) {
				System.out.println("Stock Is Completed, Cannot add a book for now");
			}
			else {
				System.out.println("Database Book sucessfully added");
			}
		}
	void book2 (int c) {
		int h=20;
		if (h==c) {
			System.out.println("Stock is Completed, Cannot add a book for now");
		}
		else {
			System.out.println("Architecture book sucessfully added");
		}
		
		
	}
			
		
	
}
class Book{
	public static void main(String args[])
	{
		
		int product,requirement,s3;
		Library l = new Library();
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("1.Java");
		System.out.println("2.Database");
		System.out.println("3.Architecture");
		System.out.println("4.Add a Java book");
		System.out.println("5.Add a Database book");
		System.out.println("6.Add a Architecture book");
		
		System.out.println(" choice:-");
		product = s1.nextInt();
		
		switch(product){
			case 1: System.out.println("Enter your requirement:-");
					requirement = s1.nextInt();
					l.Java(requirement);
					break;
					
			case 2: System.out.println("Enter your requirement:-");
					requirement = s1.nextInt();
					l.Database(requirement);
					break;
					
			case 3: System.out.println("Enter the requirement:-");
					requirement = s1.nextInt();
					l.Architecture(requirement);
					break;
					
			case 4: System.out.println("Add a Java Book:-");
			requirement = s1.nextInt();
			l.book(requirement);
			break;
			
			case 5: System.out.println("Add a Database Book:-");
			requirement = s1.nextInt();
			l. book1(requirement);
			
			case 6: System.out.println("Add a Architecture Book:-");
			requirement = s1.nextInt();
			l. book2(requirement);
			break;
			
			default: System.out.println(" Book is not available");
		}
	}
}
 


