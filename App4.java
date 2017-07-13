import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="App4" width=500 height=500>
</applet>
*/
public class App4 extends Applet implements MouseListener,MouseMotionListener
{
	String str="";
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseEntered(MouseEvent me)
	{
		str="Mouse Entered at :"+me.getX()+","+me.getY();
		setBackground(Color.red);
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		str="Mouse Exieted at :"+me.getX()+","+me.getY();
		setBackground(Color.green);
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		str="Mouse pressed at :"+me.getX()+","+me.getY();
		setBackground(Color.orange);
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		str="Mouse Released at :"+me.getX()+","+me.getY();
		setBackground(Color.blue);
		repaint();
	}	
	public void mouseClicked(MouseEvent me)
	{
		str="Mouse Clicked at :"+me.getX()+","+me.getY();
		setBackground(Color.pink);
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
	   showStatus("Mouse moving at  :"+me.getX()+","+me.getY());	
	}
	public void mouseDragged(MouseEvent me)
	{
	   showStatus("Mouse Dragging at  :"+me.getX()+","+me.getY());	
	}
	
	public void paint(Graphics g)
	{
		g.drawString(str,20,20);
	}
}