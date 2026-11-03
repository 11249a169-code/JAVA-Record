EXPNO:12(C)
  ADTE:13/10/26

                             BORDER LAYOUT
AIM:
To write and execute a Java Applet program to demonstrate the BorderLayout manager by arranging buttons and a text area in five different regions: North, South, East, West and Center.

ALGORITHM:
Start the program.
Import the required packages: java.awt.*, java.applet.*, java.io.* and java.util.*.
Create a class named insertdemo that extends the Applet class.
Define the init() method.
Set the background color of the applet to cyan using setBackground(Color.cyan).
Set the layout manager to BorderLayout.
Create and add a button with the text "this is cross the top" in the North region.
Create and add a button with the text "the footer messsage might go here" in the South region.
Add a button named "RIGHT" in the East region.
Add a button named "LEFT" in the West region.
Create a String variable containing the message "the reasonable man adapts".
Create a TextArea and add it to the Center region.
Override the getInsets() method to set a 10-pixel margin on all four sides.
Execute the applet to display the components in BorderLayout format.
Stop the program.


  PROGARM:

import java.awt.*;
import java.applet.*;
import java.io.*;
import java.util.*;
/*
<applet code="insertdemo" width=400 height=200>
</applet>
*/
public class insertdemo extends Applet
{
public void init()
{
setBackground(Color.cyan);
setLayout(new BorderLayout());
add(new Button("this is cross the top"),BorderLayout.NORTH);
add(new Button("the footer messsage might go here"),BorderLayout.SOUTH);
add(new Button("RIGHT"),BorderLayout.EAST);
add(new Button("LEFT"),BorderLayout.WEST);
String msg="the reasonable man adapts\n\n";
add(new TextArea(msg),BorderLayout.CENTER);
}
public Insets getInsets()
{
return new Insets(10,10,10,10);
}
}


RESULT:
Thus, the Java Applet program to demonstrate the BorderLayout manager by arranging buttons and a text area in five different regions was successfully executed.
