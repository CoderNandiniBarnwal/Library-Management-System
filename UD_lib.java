import java.util.Scanner;

class UD_lib{
	String books[];
	int no_of_books;
	
	UD_lib(){
		this.books=new String[100];
		this.no_of_books=0;
	}
	
	void Already_Available_Books(String bk){
		this.books[no_of_books]=bk;
		no_of_books++;
		System.out.println(bk+ " book is available");
	}
	
	void Add_Book(String bk){
		this.books[no_of_books]=bk;
		no_of_books++;
		System.out.println(bk+ " book is added");
	}
	
	void Show_Available_Books(){
		System.out.println();
		System.out.println("Available books are...");
		for(int i=0; i<no_of_books; i++){
			if(this.books[i]==null){
				continue;
			}
			System.out.println("* "+this.books[i]);
		}
	}
	void Issue_Book(String bk){
		for(int i=0; i<this.books.length; i++){
			if(this.books[i] != null && this.books[i].equals(bk)){
				System.out.println(bk+" book is issued");
				this.books[i]=null;
				break;
			}	
		}
		System.out.println("Book doesn't exist");
	}
	
	
	
	void Return_Book(String bk){
		Add_Book(bk);
	}
	
	public static void main(String args[]){
		System.out.println("Press 1 for add the books: ");
		System.out.println("Press 2 for issue the books: ");
		System.out.println("Press 3 for return the books: ");
		System.out.println();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int choice=sc.nextInt();
		
		UD_lib lib=new UD_lib();
		lib.Already_Available_Books("C");
		lib.Already_Available_Books("C++");
		lib.Already_Available_Books("Java");
		lib.Already_Available_Books("DBMS");
		
		switch (choice){
			case 1:
			Scanner ac=new Scanner(System.in);
			System.out.print("\n How many books you want to add: ");
			int size=ac.nextInt();
			System.out.println("Enter the names of the books that you want to add: ");
			String add[]=new String[size];
			for(int i=0; i<size; i++){
				add[i]=ac.next();
				lib.Add_Book(add[i]);
			}
			lib.Show_Available_Books();
			break;
		
			case 2:
			lib.Show_Available_Books();
			
			Scanner ic=new Scanner(System.in);
			System.out.print("\n How many books you want to issue: ");
			int size2=ic.nextInt();
			System.out.println("Enter the names of the books that you want to issue: ");
			String issue[]=new String[size2];
			for(int i=0; i<size2; i++){
				issue[i]=ic.next();
				lib.Issue_Book(issue[i]);
			}
			lib.Show_Available_Books();
			break;
		
			case 3:
			Scanner rc=new Scanner(System.in);
			System.out.print("\n How many books you want to add: ");
			int size3=rc.nextInt();
			System.out.println("Enter the names of the books that you want to add: ");
			String add3[]=new String[size3];
			for(int i=0; i<size3; i++){
				add3[i]=rc.next();
				lib.Add_Book(add3[i]);
			}
			lib.Show_Available_Books();
			break;
		
			default:
			System.out.print("Invalid Choice");
	
		}
	}	
}