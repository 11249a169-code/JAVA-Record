EXPNO: 1B
DATE: 28\8\26                   BINARY SEARCH

AIM: To write a Java program to search for an element in a sorted array using the Binary Search technique

ALGORITHM:
•  Start 
•  Import the Scanner class. 
•  Declare the required variables and create a Scanner object. 
•  Read the number of elements n. 
•  Create an integer array of size n. 
•  Read n elements in sorted order. 
•  Read the element x to be searched. 
•  Set first = 0 and last = n - 1. 
•  Repeat while first <= last: 
•	Calculate mid = (first + last) / 2. 
•	If a[mid] == x, the element is found. Display its position and stop searching. 
•	If a[mid] < x, set first = mid + 1. 
•	Otherwise, set last = mid - 1. 
•  If the element is not found, display "Element not found". 
•  Stop

SOURCE CODE:

import java.util.Scanner;

class BinarySearch
{
    public static void main(String args[])
    {
        int i, mid, first, last, x, n, flag = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements in sorted order:");
        for(i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        x = sc.nextInt();

        first = 0;
        last = n - 1;

        while(first <= last)
        {
            mid = (first + last) / 2;

            if(a[mid] == x)
            {
                flag = 1;
                System.out.println("Element found at position " + (mid + 1));
                break;
            }
            else if(a[mid] < x)
            {
                first = mid + 1;
            }
            else
            {
                last = mid - 1;
            }
        }

        if(flag == 0)
        {
            System.out.println("Element not found");
        }
    }
}

OUTPUT:
Enter number of elements: 6
Enter elements in sorted order:
10 20 30 40 50 60
Enter element to search: 40
Element found at position 4


  RESULT:
Thus, the Java program to search for an element in a sorted array using Binary Search was successfully executed, and the required element was found or reported as not found.

