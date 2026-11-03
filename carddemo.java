EXPNO:12(B)
  DATE:13/10/26

                        CARD LAYOUT
AIM:
To write and execute a Java Applet program to demonstrate the CardLayout manager by displaying buttons one at a time and switching between them when a button is clicked.

  ALGORITHM:
  Start the program.
Import the required packages: java.io.*, java.awt.*, java.applet.* and java.awt.event.*.
Create a class named carddemo that extends the Applet class and implements the ActionListener interface.
Declare four Button variables, a Panel and a CardLayout object.
Define the init() method.
Create a Panel using the Panel class.
Create a CardLayout object and set it as the layout manager of the panel.
Create three buttons named First Button, Second Button and Third Button.
Register each button with the addActionListener() method.
Add all three buttons to the panel using the add() method with their respective names.
Define the actionPerformed() method.
Use buttonCardLayout.next(buttonPanel) to display the next button whenever the current button is clicked.
Execute the applet.
Stop the program.


PROGRAM:
  
import java.io.*; import
java.awt.*; import
java.applet.*;
import java.awt.event.*;
/*
<applet code="carddemo" width=250 height=150>
</applet>
*/
public class carddemo extends Applet implements ActionListener
{
Button b1,b2,b3,b4; Panel
buttonPanel;
CardLayout buttonCardLayout;
public void init()
{
buttonPanel=new Panel();
add(buttonPanel);
buttonCardLayout=new CardLayout();
buttonPanel.setLayout(buttonCardLayout);
b1=new Button("first Button");
b1.addActionListener(this);
buttonPanel.add(b1,"first Button");
b2=new Button("second Button");
b2.addActionListener(this);
buttonPanel.add(b2,"second Button");
b3=new Button("third button");
b3.addActionListener(this);
buttonPanel.add(b3,"third Button");
}
public void actionPerformed(ActionEvent e)
{
buttonCardLayout.next(buttonPanel);
}
}


RESULT:
Thus, the Java Applet program to demonstrate the CardLayout manager by displaying buttons one at a time and switching between them using the next() method was successfully executed.
