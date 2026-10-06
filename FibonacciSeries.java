EXPNO:06
DATE: 18\8\26                FIBONACCI SERIES
 
AIM:
:  To write a Java program to generate and display the Fibonacci series up to n terms using a method.
ALGORITHM:
•  Start 
•  Import the Scanner class. 
•  Create a Scanner object to read input. 
•  Read the number of terms n. 
•  Call the fibonacci(n) method. 
•  In the fibonacci() method: 
•	If n == 0, display 0. 
•	If n == 1, display 0 1. 
•	Otherwise, initialize a = 0 and b = 1. 
•  Display the first two Fibonacci numbers, 0 and 1. 
•  Use a for loop to calculate the next terms: 
•	nextNumber = a + b 
•	Display nextNumber. 
•	Set a = b and b = nextNumber. 
•  Continue until the required number of terms is generated. 
•  Stop

 SOURCE CODE:

import java.util.Scanner;
 public class FibonacciSeries
 {
public static void main(String[] args) 
{
 Scanner s = new Scanner(System.in); 
System.out.print("Enter the value of n: ");
 int n = s.nextInt();
fibonacci(n);
}
public static void fibonacci(int n)
 { 
if (n == 0)
 {
System.out.println("0");
}
 else if (n == 1) 
{ 
System.out.println("0 1");
} 
else
 {
System.out.print("0 1 ");
 int a = 0;
int b = 1;
for (int i = 1; i < n; i++) 
{ 
int nextNumber = a + b;
System.out.print(nextNumber + " ");
a = b;
b = nextNumber;
}
}
}
}

OUTPUT:

Enter the value of n: 8
0 1 1 2 3 5 8 13 21

 RESULT:
Thus, the Java program to generate the Fibonacci series using a method was successfully executed, and the Fibonacci series was displayed.

