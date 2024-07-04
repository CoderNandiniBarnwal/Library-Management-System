//Address Book: Ek address book banaye jisme aap logon ke naam, phone numbers, aur addresses ko store kar sakte hain. Aap unhe add, delete, aur search bhi kar sakte hain.

import java.util.Scanner;

class Address_Book2{
	String name[];
	int phone[];
	String address[];
	int no_of_line;
	
	Address_Book2(){
		this.name=new String[100];
		this.phone=new int[100];
		this.address=new String[100];
		this.no_of_line=0;
	}
	void alreadyAvailable(String nn, int pp, String aa){
		this.name[no_of_line]=nn;
		this.phone[no_of_line]=pp;
		this.address[no_of_line]=aa;
		
		no_of_line++;
		System.out.println(nn+" "+pp+" "+aa+" "+" is available");
	}
	void addLine(String nn, int pp, String aa){
		this.name[no_of_line]=nn;
		this.phone[no_of_line]=pp;
		this.address[no_of_line]=aa;
		
		no_of_line++;
		System.out.println(nn+" "+pp+" "+aa+" "+" is added");
	}  
	void showAvailableLine(){
		System.out.println("Available lines are: ");
		for(int i=0; i<this.name.length; i++){
			if(this.name[i]==null){
				continue;
			}
			else if(this.phone[i]==0){
				continue;
			}
			else if(this.address[i]==null){
				continue;
			}
			
			System.out.println("* "+this.name[i]+", "+this.phone[i]+", "+this.address[i]+" is available");
		}
	}
	
	void dltLine(String nn, int pp, String aa){
		for(int i=0; i<no_of_line; i++){	
			if((this.name[i] != null && this.name[i].toLowerCase().equals(nn.toLowerCase())) && (this.phone[i] != 0 && this.phone[i] == pp) && (this.address[i] != null && this.address[i].toLowerCase().equals(aa.toLowerCase()))){
				this.name[i] = null;
				this.phone[i] = 0;
				this.address[i] = null;
				System.out.println(nn + " " + pp + " " + aa + " " + "is removed");
				break;
			} 
		}
		System.out.println("This line doesn't exist");
	}
	void searchLine(String nn, int pp, String aa){
		for(int i=0; i<no_of_line; i++){	
			if((this.name[i] != null && this.name[i].toLowerCase().equals(nn.toLowerCase())) && (this.phone[i] != 0 && this.phone[i] == pp) && (this.address[i] != null && this.address[i].toLowerCase().equals(aa.toLowerCase()))){
				System.out.println(nn + " " + pp + " " + aa + " is there in line number "+(i+1));
				break;
			} 								
		}
		System.out.println("This line doesn't exist");
	}
	
	public static void main(String args[]){
		Address_Book2 ab=new Address_Book2();
		ab.alreadyAvailable("Nandini",765444,"Parasea");
		ab.alreadyAvailable("Nidhi",76744,"Raniganj");
		ab.alreadyAvailable("Nancy",765744,"Parasea");
		ab.alreadyAvailable("Naini",76744,"Parasea");
		ab.alreadyAvailable("Nibha",76744,"Raniganj");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\n1. Add lines");
		System.out.println("2. Deleat lines");
		System.out.println("3. Search lines");
		
		System.out.println("Enter your choice: ");
		int ch=sc.nextInt();
		
		switch (ch){
			case 1:
			{
			Scanner ac=new Scanner(System.in);
			System.out.print("\nHow many lines you want to add: ");
			int size=ac.nextInt();
			System.out.println("Enter the name, phone number and address that you want to add: ");
			String nm[]=new String[size];
			String add[]=new String[size];
			int pn[]=new int[size];
			for(int i=0; i<size; i++){
				nm[i]=ac.next();
				pn[i]=ac.nextInt();
				ac.nextLine();
				add[i]=ac.next();
				ab.addLine(nm[i],pn[i],add[i]);
			}
			ab.showAvailableLine();
			break;
			}
			
			
			case 2:
			{			
			Scanner rc=new Scanner(System.in);
			System.out.print("\nHow many lines you want to remove: ");
			int size=rc.nextInt();
			System.out.println("Enter the name, phone number and address that you want to add: ");
			String nm[]=new String[size];
			String add[]=new String[size];
			int pn[]=new int[size];
			for(int i=0; i<size; i++){
				nm[i]=rc.next(); 
				pn[i]=rc.nextInt();
				rc.nextLine();
				add[i]=rc.next();
				ab.dltLine(nm[i],pn[i],add[i]);
			}
			ab.showAvailableLine();
			break;
			}
			
			case 3:
			{			
			Scanner rc=new Scanner(System.in);
			System.out.print("\nHow many lines you want to search: ");
			int size=rc.nextInt();
			System.out.println("Enter the name, phone number and address that you want to search: ");
			String nm[]=new String[size];
			String add[]=new String[size];
			int pn[]=new int[size];
			for(int i=0; i<size; i++){
				nm[i]=rc.next(); 
				pn[i]=rc.nextInt();
				rc.nextLine();
				add[i]=rc.next();
				ab.searchLine(nm[i],pn[i],add[i]);
			}
			ab.showAvailableLine();
			break;
			}
			
			default:
			System.out.print("Invalid Choice");
		}
		
	}
}