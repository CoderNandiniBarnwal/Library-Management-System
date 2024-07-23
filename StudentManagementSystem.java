//. StudentManagementSystem: Ek student management system banaye jisme aap students ke naam, roll numbers, aur grades ko manage kar sake. Aap unhe add, delete, aur search bhi kar sakte hain.

import java.util.*;
class less_0 extends Exception{
	public String toString(){
		return "You can't give value greater then 10";
	}
	public String getMessage(){
		return "YPlease give value lower then 10";
	}
}
class StudentManagementSystem{
	String name[];
	int roll[];
	String grade[];
	int no_of_students;
	
	StudentManagementSystem(){
		this.name=new String[100];
		this.roll=new int[100];
		this.grade=new String[100];
		int no_of_students=0;
	}
	
	void alreadyAvailableStudents(String nn, int rr, String gg){
		this.name[no_of_students]=nn;
		this.roll[no_of_students]=rr;
		this.grade[no_of_students]=gg;
		no_of_students++;
		System.out.println(nn+" "+rr+" "+gg+" is available");
	}
	void addStudents(String nn, int rr, String gg){
		this.name[no_of_students]=nn;
		this.roll[no_of_students]=rr;
		this.grade[no_of_students]=gg;
		no_of_students++;
		System.out.println(nn+" "+rr+" "+gg+" is added");
	}
	void showAvailableStudents(){
		System.out.println("Available lines are...");
		for(int i=0; i<no_of_students; i++){
			if((this.name[i]==null) || (this.roll[i]==0) || (this.grade[i]==null)){
				continue;
			}
			System.out.println(this.name[i]+" "+this.roll[i]+" "+this.grade[i]+" is there");
		}
	}
	void removeStudents(String nn, int rr, String gg){
		for(int i=0; i<no_of_students; i++){
			if((this.name[i]!=null && this.name[i].toLowerCase().equals(nn.toLowerCase())) &&
			   (this.roll[i]!=0 && this.roll[i] == rr) &&
			   (this.grade[i]!=null && this.grade[i].toLowerCase().equals(gg.toLowerCase())))
			   {
				   System.out.println(nn+" "+rr+" "+gg+" is removed");
				   this.name[i]=null;
				   this.roll[i]=0;
				   this.grade[i]=null;
				   break;
			   }
		}
		System.out.println("The record of this student is n't there");
	}
	void searchStudents(String nn, int rr, String gg){
	for(int i=0; i<no_of_students; i++){
			if((this.name[i]!=null && this.name[i].toLowerCase().equals(nn.toLowerCase())) &&
			   (this.roll[i]!=0 && this.roll[i] == rr) &&
			   (this.grade[i]!=null && this.grade[i].toLowerCase().equals(gg.toLowerCase())))
			   {
				   System.out.println(nn+" "+rr+" "+gg+" is there in record");
			   }
		}
		System.out.println("The record of this student is n't there");
	}
				
	public static void main(String args[]){
		System.out.println("1. Add Student Details");
		System.out.println("2. Remove Student Details");
		System.out.println("3. Search Student Details \n");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your choice: ");
		int choice=sc.nextInt();
		
		StudentManagementSystem obj=new StudentManagementSystem();
		obj.alreadyAvailableStudents("Neha", 2, "A");
		obj.alreadyAvailableStudents("Nisha", 3, "B");
		obj.alreadyAvailableStudents("Tannu", 4, "C");
		switch(choice){
			case 1:
			{
				System.out.print("How many student details you want to add: ");
				int size=sc.nextInt();
				if(size<1){
					try{
						throw new ArithmeticException("Exception occurs");
					}
					catch(Exception e){
						System.out.println(e.getMessage());
						System.out.println(e.toString());
						System.out.println();
						e.printStackTrace();
					}
				}
				less_0 ll=new less_0();
				System.out.println(ll.getMessage());
				System.out.println(ll.toString());
				
				String name[]=new String[size];
				String grade[]=new String[size];
				try{
					int roll[]=new int[size];
									
				for(int i=0; i<size; i++){
					System.out.println("enter the name, roll & grade of student"+(i+1)+" : ");
					name[i]=sc.next();
					roll[i]=sc.nextInt();
					grade[i]=sc.next();
					
					obj.addStudents(name[i], roll[i], grade[i]);
				}
				}
				catch(InputMismatchException ex){
					System.out.println(ex);
				}

				obj.showAvailableStudents();
				break;
			}
			
			case 2:
			{
				obj.showAvailableStudents();
				System.out.print("How many student details you want to remove: ");
				int size=sc.nextInt();
				
				if(size<1){
					try{
						throw new ArithmeticException("Exception occurs");
					}
					catch(Exception e){
						System.out.println(e.getMessage());
						System.out.println(e.toString());
						System.out.println();
						e.printStackTrace();
					}
				}
				less_0 ll=new less_0();
				System.out.println(ll.getMessage());
				System.out.println(ll.toString());
				
				String name[]=new String[size];
				String grade[]=new String[size];
				try{
				int roll[]=new int[size];
				
				for(int i=0; i<size; i++){
					System.out.println("enter the name, roll & grade of student: ");
					name[i]=sc.next();
					roll[i]=sc.nextInt();
					grade[i]=sc.next();
					
					obj.removeStudents(name[i], roll[i], grade[i]);
					obj.showAvailableStudents();
				}
				}
				catch(InputMismatchException ex){
					System.out.println(ex);
				}
				break;
			}
			
			case 3:
			{
				System.out.print("How many student details you want to search: ");
				int size=sc.nextInt();
				
				if(size<1){
					try{
						throw new ArithmeticException("Exception occurs");
					}
					catch(Exception e){
						System.out.println(e.getMessage());
						System.out.println(e.toString());
						System.out.println();
						e.printStackTrace();
					}
				}
				less_0 ll=new less_0();
				System.out.println(ll.getMessage());
				System.out.println(ll.toString());
				
				String name[]=new String[size];
				String grade[]=new String[size];
				try{
				int roll[]=new int[size];
				
				for(int i=0; i<size; i++){
					System.out.println("enter the name, roll & grade of student: ");
					name[i]=sc.next();
					roll[i]=sc.nextInt();
					grade[i]=sc.next();
					
					obj.searchStudents(name[i], roll[i], grade[i]);
					obj.showAvailableStudents();
				}
				}
				catch(InputMismatchException ex){
					System.out.println(ex);
				}
				break;
			}
			
			default:
			{
				System.out.println("Invalid Choice");
			}
		}
	}
}