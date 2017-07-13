import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code ="App5" width=500 height=500>
</applet>
*/
public class App5 extends Applet 
{
	String str;
	public void init()
	{
		addMouseListener(new AdapterDemo());
	}
	public void paint(Graphics g)
	{
		g.drawString(str,20,20);
	}
	class AdapterDemo extends MouseAdapter
	{
	      public void mouseEntered(MouseEvent me)
	       {
		str="Mouse Entered at "+me.getX()+","+me.getY();
		repaint();
	       }
	       public void mouseExited(MouseEvent me)
	       {
		str="Mouse Exited at "+me.getX()+","+me.getY();
		repaint();
	       }
	}
}