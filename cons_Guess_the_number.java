import java.util.Scanner;
class cons_Guess_the_number{
		private int number=0, guess=0;
		cons_Guess_the_number(int n,int g){
			number=n;
			guess=g;
		}
		cons_Guess_the_number(){
			number=number;
			guess=guess;
		}
		int getNumber(){
			return number;
		}
		void setNumber(){
			this.number=number;
		}
		int getGuess(){
			return guess;
		}
		void setGuess(){
			this.guess=guess;
		}
		void display(int guess){
			System.out.println("You have enter right number in "+guess+" attemps");
		}
		
		public static void main(String args[]){
			int c_n=(int)(Math.random()*100);
			int number=0,guess=0;
			while(c_n!=number){
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number: ");
				number=sc.nextInt();
				guess++;
				if(c_n>number)
				{
					System.out.println("Enter higher number: ");
				}
				else if(c_n<number)
				{
					System.out.println("Enter lower number: ");
				}
				else{				
				{
					System.out.println("You guess the right number");
					cons_Guess_the_number c=new cons_Guess_the_number();
					c.display(guess);
				}		
			}					
		}
	}
}