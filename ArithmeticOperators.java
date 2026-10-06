EXPNO:2A
 DATE:4\8\26                   ARITHMETIC OPERATIONS USING SWITCH CASE

  AIM: To write a Java program to perform arithmetic operations such as addition, subtraction, multiplication, division, and modulus on two numbers using a menu-driven program.

ALGORITHM:
1.	Start 
2.	Import the Scanner class. 
3.	Create a Scanner object to read input from the user. 
4.	Read two integer values x and y. 
5.	Display the menu of arithmetic operations: 
o	Addition 
o	Subtraction 
o	Multiplication 
o	Division 
o	Modulus 
o	Exit 
6.	Read the user's choice. 
7.	Use a switch statement to perform the selected operation: 
o	If choice is 1, calculate x + y. 
o	If choice is 2, calculate x - y. 
o	If choice is 3, calculate x * y. 
o	If choice is 4, calculate x / y. Check that y is not zero before division. 
o	If choice is 5, calculate x % y. 
o	If choice is 6, terminate the program. 
o	Otherwise, display "Invalid choice!" 
8.	Display the result. 
9.	Repeat the process until the user selects Exit. 
10.	Stop

SOURCE CODE:

import java.util.Scanner;
public class ArithmeticOperators {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter the two numbers to perform operations");
            System.out.print("Enter the first number: ");
            int x = s.nextInt();
            System.out.print("Enter the second number: ");
            int y = s.nextInt();
            System.out.println("\nChoose the operation you want to perform:");
            System.out.println("1. ADDITION");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.out.println("5. MODULUS");
            System.out.println("6. EXIT");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    int add = x + y;
                    System.out.println("Result: " + add);
                    break;
                case 2:
                    int sub = x - y;
                    System.out.println("Result: " + sub);
                    break;
                case 3:
                    int mul = x * y;
                    System.out.println("Result: " + mul);
                    break;
                case 4:
                    if (y != 0) {
                        float div = (float) x / y;
                        System.out.println("Result: " + div);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;
                case 5:
                    int mod = x % y;
                    System.out.println("Result: " + mod);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

OUTPUT
Enter the two numbers to perform operations
Enter the first number: 20
Enter the second number: 10

Choose the operation you want to perform:
1. ADDITION
2. SUBTRACTION
3. MULTIPLICATION
4. DIVISION
5. MODULUS
6. EXIT
1.ADDITION
Result: 30

   RESULT:
Thus, the Java program to perform arithmetic operations using a menu-driven approach was successfully executed, and the results for addition, subtraction, multiplication, division, and modulus were obtained.
