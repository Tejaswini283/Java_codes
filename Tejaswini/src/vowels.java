import java.io.*;
import java.util.*;
public class vowels
{
public static void main(String args[])
{
System.out.println("enter the string"); 
Scanner read=new Scanner(System.in);
String str=read.nextLine();
String reverse="";
for (int i=str.length()-1;i>=0;i--)
{
reverse=reverse + str.charAt(i);
}
System.out.println("revered string");
System.out.println(reverse);

int count=0;

for (int i=0;i<reverse.length();i++){
char ch=reverse.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
count++;
}
}
System.out.println("Number of vowels ="+count);
}
}