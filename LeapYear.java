EXPNO:2D
DATE: 04\8\26                 LEAP YEAR

AIM:
   To write a Java program to check whether a given year is a leap year or not using conditional statements.

ALGORITHM:
 1.	Start 
2.	Import the Scanner class. 
3.	Create a Scanner object to read input. 
4.	Read the year from the user. 
5.	Check whether the year is divisible by 400. 
o	If yes, it is a leap year. 
6.	Otherwise, check whether the year is divisible by 100. 
o	If yes, it is not a leap year. 
7.	Otherwise, check whether the year is divisible by 4. 
o	If yes, it is a leap year. 
8.	Otherwise, it is not a leap year. 
9.	Display whether the given year is a leap year or not. 
10.	Close the Scanner. 
11.	Stop 
   

SOURCE CODE:

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any year: ");
        int year = s.nextInt();
        boolean flag = false;
        if (year % 400 == 0) {
            flag = true;
        } else if (year % 100 == 0) {
            flag = false;
        } else if (year % 4 == 0) {
            flag = true;
        } else {
            flag = false;
        }
        if (flag) {
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is not a leap year");
        }
        s.close();
    }
}

OUTPUT:

Enter any year: 2024
Year 2024 is a leap year

RESULT:
Thus, the Java program to check whether the given year is a leap year or not was successfully executed, and the required result was obtained.


