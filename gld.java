EXPNO:12(A)
    DATE:13/10/26

                        GRID LAYOUT

    AIM:
To write and execute a Java Applet program to demonstrate the GridLayout manager by arranging ten buttons (A to J) in a grid of 5 rows and 2 columns.

ALGORITHM:
Start the program.
Import the required java.awt.* and java.applet.* packages.
Create a class named gld that extends the Applet class.
Define the init() method.
Set the layout manager to GridLayout(5, 2) to arrange components in 5 rows and 2 columns.
Create ten Button objects with labels A, B, C, D, E, F, G, H, I and J.
Add all ten buttons to the applet using the add() method.
Override the getInsets() method to provide a margin of 20 pixels on all four sides.
Run the applet to display the buttons in grid format.
Stop the program.    

PROGARM:

import java.awt.*;
import java.applet.*;

/* <applet code="gld.class" height=300 width=300>
</applet> */

public class gld extends Applet
{
    public void init()
    {
        setLayout(new GridLayout(5, 2));

        Button b1 = new Button("A");
        Button b2 = new Button("B");
        Button b3 = new Button("C");
        Button b4 = new Button("D");
        Button b5 = new Button("E");
        Button b6 = new Button("F");
        Button b7 = new Button("G");
        Button b8 = new Button("H");
        Button b9 = new Button("I");
        Button b10 = new Button("J");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
    }

    public Insets getInsets()
    {
        return new Insets(20, 20, 20, 20);
    }
}

RESULT:
Thus, the Java Applet program to demonstrate the GridLayout manager by arranging ten buttons in 5 rows and 2 columns was successfully executed.
    
