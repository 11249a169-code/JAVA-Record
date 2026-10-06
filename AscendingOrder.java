EXPNO:1A
DATE:28\8\26                         SORT IN ASCENDING ORDER

AIM: To write a program to sort the given elements in ascending order (smallest to largest). 

 ALGORITHM:
 1. Read the number of elements, n. 
2. Read n elements into an array. 
3. Compare each element with the elements that follow it. 
4. If the current element is greater than the next element, swap them. 
5. Repeat the comparison until all elements are arranged from smallest to largest. 
6. Display the sorted array. 
7. Stop

SOURCE CODE:
import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements you want in array: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) { // Changed from < to > for ascending order
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending order: ");
        for (int i = 0; i < n - 1; i++) { // Removed the incorrect semicolon here
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
        s.close();
    }
}

OUTPUT:
Enter number of elements you want in array: 5
Enter all the elements:
5 2 8 1 4
Ascending order: 1,2,4,5,8

    RESULT:

Thus, the Java program to sort the given array elements in ascending order was successfully executed, and the elements were displayed in ascending order.

