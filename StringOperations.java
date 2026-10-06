EXPNO:03
DATE:11\8\26                   STRING OPERATIONS

AIM: 
    To write a Java program to perform various string operations using built-in String methods such as length, character extraction, case conversion, substring, concatenation, searching, replacing, comparison, and trimming

ALGORITHM:
Start 
•  Declare and initialize the string str with the value "Hello Java". 
•  Find and display the length of the string using length(). 
•  Display the character at index 1 using charAt(). 
•  Convert the string to uppercase using toUpperCase(). 
•  Convert the string to lowercase using toLowerCase(). 
•  Extract a substring starting from index 6 using substring(). 
•  Concatenate " Programming" to the string using concat(). 
•  Check whether the string contains "Java" using contains(). 
•  Find the index of character 'J' using indexOf(). 
•  Find the last index of character 'a' using lastIndexOf(). 
•  Replace "Java" with "World" using replace(). 
•  Check whether the string starts with "Hello" using startsWith(). 
•  Check whether the string ends with "Java" using endsWith(). 
•  Compare two strings using equals(). 
•  Remove leading and trailing spaces from another string using trim(). 
•  Display all the results. 
•  Stop

SOURCE CODE:

public class StringOperations {
    public static void main(String[] args) {
        String str = "Hello Java";
        System.out.println("1. Length: " + str.length());
        System.out.println("2. Character at index 1: " + str.charAt(1));
        System.out.println("3. Uppercase: " + str.toUpperCase());
        System.out.println("4. Lowercase: " + str.toLowerCase());
        System.out.println("5. Substring: " + str.substring(6));
        System.out.println("6. Concatenation: " + str.concat(" Programming"));
        System.out.println("7. Contains 'Java': " + str.contains("Java"));
        System.out.println("8. Index of 'J': " + str.indexOf('J'));
        System.out.println("9. Last index of 'a': " + str.lastIndexOf('a'));
        System.out.println("10. Replace: " + str.replace("Java", "World"));
        System.out.println("11. Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("12. Ends with 'Java': " + str.endsWith("Java"));
        String str2 = "Hello Java";
        System.out.println("13. Equals: " + str.equals(str2));
        String str3 = "   Hello Java   ";
        System.out.println("14. Trim: " + str3.trim());
    }
}

OUTPUT:
1. Length: 10
2. Character at index 1: e
3. Uppercase: HELLO JAVA
4. Lowercase: hello java
5. Substring: Java
6. Concatenation: Hello Java Programming
7. Contains 'Java': true
8. Index of 'J': 6
9. Last index of 'a': 9
10. Replace: Hello World
11. Starts with 'Hello': true
12. Ends with 'Java': true
13. Equals: true
14. Trim: Hello Java

    RESULT:

Thus, the Java program to perform various string operations using predefined String methods was successfully executed, and the results of all the string operations were displayed.

