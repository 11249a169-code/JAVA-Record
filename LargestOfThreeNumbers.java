EXPNO:2C
 DATE:04\8\26                      LARGEST OF THREE NUMBERS

    
AIM: To write a Java program to find the largest among three given integers using an if-else-if statement.

ALGORITHM:
•  Start 
•  Import the Scanner class. 
•  Create a Scanner object to read input. 
•  Read three integers x, y, and z. 
•  Compare x with y and z. 
•	If x > y and x > z, display "First number is largest". 
•  Otherwise, compare y with x and z. 
•	If y > x and y > z, display "Second number is largest". 
•  Otherwise, compare z with x and y. 
•	If z > x and z > y, display "Third number is largest". 
•  If none of the above conditions is satisfied, display "The numbers are not distinct or equal". 
•  Stop
    
SOURCE CODE:

import java.util.Scanner;
class LargestOfThreeNumbers {
    public static void main(String args[]) {
        int x, y, z;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three integers:");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        if (x > y && x > z) {
            System.out.println("First number is largest");
        } 
        else if (y > x && y > z) {
            System.out.println("Second number is largest");
        } 
        else if (z > x && z > y) {
            System.out.println("Third number is largest");
        } 
        else {
            System.out.println("The numbers are not distinct or equal");
        }
    }
}

OUTPUT:
Enter three integers:
25
40
15
Second number is largest

    RESULT:

Thus, the Java program to find the largest among three given integers was successfully executed, and the largest number was identified.
