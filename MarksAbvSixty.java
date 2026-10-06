EXPNO:1D
 DATE: 28\7\26                     TO PRINT MARKS ABOVE SIXTY

  AIM:  To write a Java program to read the names and marks of 6 students and display the students who scored more than 60 marks

ALGORITHM:
•  Start 
•  Declare two arrays: 
•	name[] to store the names of 6 students. 
•	marks[] to store their marks. 
•  Create a Scanner object to read input. 
•  Use a for loop to read the name and marks of each student. 
•  Store the name and marks in the respective arrays. 
•  Traverse the marks[] array using another for loop. 
•  Check whether each student's marks are greater than 60. 
•  If marks[i] > 60, display the student's name and marks. 
•  Stop


    SOURCE CODE:

import java.util.Scanner;
public class MarksAbvSixty
{
    public static void main(String args[])
    {
        int marks[] = new int[6];
        String name[] = new String[6];
        int i;
        Scanner scanner = new Scanner(System.in);
        for(i = 0; i < 6; i++)
        {
            System.out.print("Enter Name of Student and Marks of Subject " + (i + 1) + ": ");
            name[i] = scanner.next();
            marks[i] = scanner.nextInt();
        }
        System.out.println("\nStudents scoring more than 60:");
        for(i = 0; i < 6; i++)
        {
            if(marks[i] > 60)
            {
                System.out.println(name[i] + " : " + marks[i]);
            }
        }
    }
}

OUTPUT:
Enter Name of Student and Marks of Subject 1: Arun 75
Enter Name of Student and Marks of Subject 2: Bina 55
Enter Name of Student and Marks of Subject 3: Charan 82
Enter Name of Student and Marks of Subject 4: Divya 60
Enter Name of Student and Marks of Subject 5: Esha 91
Enter Name of Student and Marks of Subject 6: Ravi 48
Students scoring more than 60:
Arun : 75
Charan : 82
Esha : 91


RESULT:
Thus, the Java program to display the names and marks of students scoring more than 60 marks was successfully executed and the required output was obtained.
