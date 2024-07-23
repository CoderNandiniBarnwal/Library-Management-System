import java.util.Scanner;

public class game{
  private int stone,paper,Scissor,num1,num2;

  public void setNum1(int num1)
  {
    this.num1=num1;
  }
  public int getNum1()
  {
    return num1;
  }
  public void setNum2(int num2)
  {
    this.num2=num2;
  }
  public int getNum2()
  {
    return num2;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    game gm=new game();
    System.out.println("1 for Stone");
    System.out.println("2 for Paper");
    System.out.println("3 for Seasor");
    System.out.println();

    System.out.print("Enter the choice of person1 ");
    int num1=sc.nextInt();
    System.out.println();
    System.out.print("Enter the choice of person2 ");
    int num2=sc.nextInt();

    if(num1==num2){
       System.out.print("Draw match");
    }
    else if(num1==1 && num2==3){
       System.out.print("person 1 win the match");
    }
    else if(num1==2 && num2==1){
       System.out.print("person 1 win the match");
    }
    else if(num1==3 && num2==2){
       System.out.print("person 1 win the match");
    }
    else if(num1==2 && num2==3){
       System.out.print("person 2 win the match");
    }
    else if(num1==3 && num2==2){
       System.out.print("person 2 win the match");
    }
    else if(num1==1 && num2==2){
       System.out.print("person 2 win the match");
    }
    else{
       System.out.print("Wrong choice");
    }
  }
}
    