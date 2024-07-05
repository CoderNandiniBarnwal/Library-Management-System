/*  Input a string of alphabets. Find out the number of occurrence of all alphabets in that string. Find out the alphabet with maximum occurrence. */

import java.util.Scanner;

class maximum_occurrence{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter any String: ");
String s=sc.nextLine();
int count=0;
for(int i=0; i<s.length(); i++)
{
for(int j=0; j<s.length(); j++)
{
if(s.charAt(i)==s.charAt(j))
{
count++;

System.out.println("Total repeatation  "+s.charAt(i) +" is "+ count);

}
}
}
//System.out.println("Total repeatation: "+count);
}
}