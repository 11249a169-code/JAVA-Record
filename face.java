EXPNO:12(D)
   DATE:13/10/26

                      AWAKING A HUMAN FACE USING APPLETS

   AIM:
To write and execute a Java Applet program to draw a human face using different Graphics class methods such as drawOval(), fillOval() and fillArc()
   .
ALGORITHM
Start the program
Import the required packages: java.awt.*, java.io.* and java.applet.*.
Create a class named face that extends the Applet class.
Define the paint(Graphics g) method.
Use the drawOval() method to draw the outer face.
Draw two eyes using the drawOval() method.
Draw the eyeballs using drawOval() and fillOval() methods.
Use the fillArc() method to draw the nose.
Use the fillArc() method to draw the mouth.
Draw two ears using the drawOval() method.
Display the completed face in the applet window.
Stop the program

PROGRAM:

import java.awt.*;
import java.io.*;
import java.applet.*;

public class face extends Applet
{
   /*
<applet code="face.class" width="300" height="300">
</applet>
*/ public void paint(Graphics g)
    {
        g.drawOval(40, 40, 120, 150);
        g.drawOval(57, 75, 30, 20);
        g.drawOval(110, 75, 30, 20);

        g.drawOval(68, 81, 10, 10);
        g.fillOval(121, 81, 10, 10);

        g.fillArc(85, 100, 30, 30, 0, 180);
        g.fillArc(60, 125, 80, 40, 180, 180);

        g.drawOval(25, 92, 15, 30);
        g.drawOval(160, 92, 15, 30);
    }
}

RESULT:
Thus, the Java Applet program to draw a human face using Graphics class methods such as drawOval(), fillOval() and fillArc() was successfully executed.
