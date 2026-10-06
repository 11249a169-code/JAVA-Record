EXPNO:05
 DATE: 18\8\26              AMSTRONG NUMBER

AIM:
To write a Java program to check whether a given positive number is an Armstrong number or not.

ALGORITHM:
•  Start 
•  Import the Scanner class. 
•  Declare the required variables n, nu, num, and rem. 
•  Read a positive integer n from the user. 
•  Store the original number n in nu. 
•  Initialize num = 0. 
•  Repeat the following steps while nu != 0: 
•	Find the last digit using rem = nu % 10. 
•	Calculate the cube of the digit and add it to num. 
•	Remove the last digit using nu = nu / 10. 
•  Compare num with the original number n. 
•  If num == n, display "Armstrong Number". 
•  Otherwise, display "Not an Armstrong Number". 
•  Stop

 SOURCE CODE:

import java.util.Scanner;
 public class Armstrong
{
public static void main(String args[])
{
int n, nu, num=0, rem;
Scanner scan = new Scanner(System.in);

System.out.print("Enter any Positive Number : ");
 n = scan.nextInt();
nu = n; while(nu != 0)
{
rem = nu%10;
num = num + rem*rem*rem; nu = nu/10;
}
if(num == n)
{
System.out.print("Armstrong Number");
}
else
{
System.out.print("Not an Armstrong Number");
}
}
}

OUTPUT:
Enter any Positive Number : 153
Armstrong Number

 RESULT:
Thus, the Java program to check whether a given positive number is an Armstrong number or not was successfully executed, and the required result was obtained.

