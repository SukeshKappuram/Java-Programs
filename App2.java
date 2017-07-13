import java.awt.*;
import java.applet.*;
/*
<applet code="App2.class" width=500 height =500>
</applet>
*/
public class App2 extends Applet
{
	String str;
	public void init()
	{
		setBackground(Color.red);
		setForeground(Color.blue);
	}
	public void paint(Graphics g)
	{
	System.out.println("Hello");	
	g.drawString("Hello world",20,20);
	}
}