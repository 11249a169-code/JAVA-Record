EXPNO:2B
 DATE:18\8\26                EVEN OR ODD USING SWITCH CASE


   AIM:  :    To write a Java program to check whether a given number is even or odd using a switch statement.

ALGORIHTM:
Start 
•  Import the Scanner class. 
•  Create a Scanner object to read input. 
•  Read an integer n from the user. 
•  Calculate the remainder of n when divided by 2 using n % 2. 
•  Use a switch statement: 
•	If the remainder is 0, display "This number is even". 
•	If the remainder is 1, display "This number is odd". 
•	Otherwise, display "Invalid input". 
•  Stop
    
SOURCE CODE:

import java.util.Scanner;
class EvenOddSwitch {
    public static void main(String args[]) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = s.nextInt();
        switch (n % 2) {
            case 0:
                System.out.println("This number is even");
                break;
            case 1:
                System.out.println("This number is odd");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}

OUTPUT:
Enter a number: 24
This number is even

  RESULT:
Thus, the Java program to check whether a given number is even or odd using a switch statement was successfully executed, and the required result was obtained.



