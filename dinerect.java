EXPNO:12(E)
    DATE:13/10/26

                           DRAWING LINE AND RECTANGLE USING APPLETS

    AIM:
To write and execute a Java Applet program to demonstrate different graphical shapes using Graphics class methods such as drawLine(), drawRect(), fillRect(), drawRoundRect() and fillRoundRect().

ALGORITHM:
Start the program.
Import the required packages: java.awt.*, java.io.* and java.applet.*.
Create a class named dinerect that extends the Applet class.
Define the paint(Graphics g) method.
Use the drawLine() method to draw a line.
Use the drawRect() method to draw an outlined rectangle
Use the fillRect() method to draw a filled rectangle.
Use the drawRoundRect() method to draw a rounded rectangle.
Use the fillRoundRect() method to draw a filled rounded rectangle.
Use the drawLine() method again to draw two intersecting diagonal lines.
Display all the graphical shapes in the applet window.
Stop the program.    


    PROGARM
    
import java.awt.*;
import java.io.*;
import java.applet.*;

/* <applet code="dinerect.class" width="300" height="200"> </applet>
*/

public class dinerect extends Applet
{
public void paint(Graphics g)
{
g.drawLine(10, 10, 50, 50);

    g.drawRect(10, 60, 40, 30);
    g.fillRect(60, 10, 30, 80);

    g.drawRoundRect(10, 100, 80, 50, 10, 10);
    g.fillRoundRect(20, 110, 60, 30, 5, 5);

    g.drawLine(100, 10, 230, 140);
    g.drawLine(100, 140, 230, 10);
}


}

RESULT:
Thus, the Java Applet program to draw different graphical shapes using Graphics class methods was successfully executed.
