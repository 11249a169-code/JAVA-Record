EXPNO:1C
DATE:28\8\26            FINDING THE LARGEST AND SMALEST NUMBER IN AN ARRAY 

AIM:  To write a Java program to find the sum, largest element, and smallest element in an array.

ALGORITHM:
•  Start 
•  Declare and initialize an integer array with the given elements. 
•  Initialize sum = 0. 
•  Initialize min and max with the first element of the array. 
•  Traverse through each element of the array using a for loop. 
•  Compare each element with max. 
•	If the element is greater than max, assign it to max. 
•  Compare each element with min. 
•	If the element is smaller than min, assign it to min. 
•  Add each element to sum. 
•  After traversing the array, display the sum, largest number, and smallest number. 
•  Stop

  SOURCE CODE:  

import java.util.Scanner;
public class LargestSmallest
{
    public static void main(String args[])
    {
        int a[] = {23, 34, 13, 64, 72, 90, 10, 15, 9, 27};

        int sum = 0;
        int min = a[0];
        int max = a[0];

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }

            if (a[i] < min)
            {
                min = a[i];
            }

            sum = sum + a[i];
        }

        System.out.println("The sum is: " + sum);
        System.out.println("Largest number in the array is: " + max);
        System.out.println("Smallest number in the array is: " + min);
    }
}

OUTPUT:
The sum is: 357
Largest number in the array is: 90
Smallest number in the array is: 9

 RESULT:
Thus, the Java program to find the sum, largest number, and smallest number in the given array was successfully executed, and the required results were obtained.
