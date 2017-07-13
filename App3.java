		//ItemEvent
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code ="App3" width =500  height=500>
</applet>
*/
public class App3 extends Applet implements ItemListener
{
	Checkbox cb1,cb2,cb3;
	
	public void init()
	{
		cb1=new Checkbox("Rose");
		cb2=new Checkbox("Jasmine");
		cb3=new Checkbox("Lotus");
		add(cb1);add(cb2);add(cb3);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();//calling paint method againg
	}
	public void paint(Graphics g)
	{
	g.drawString("Current State   :",100,100);
	g.drawString("Rose  Status   :"+cb1.getState(),100,130);
	g.drawString("Jasmine Status  :"+cb2.getState(),100,160);
	g.drawString("Lotus Status   :"+cb3.getState(),100,190);

	}
}