import java.awt.*;
import java.applet.*;
/*<applet code="App1" width=500 height=500>
</applet>
*/
public class App1 extends Applet 
{
	public void init()
	{
		System.out.println("init");
	}
	public void start()
	{
		System.out.println("start");
	}
	public void  stop()
	{
		System.out.println("stop");
	}
	public void paint(Graphics g)
	{
		System.out.println("paint");
	}
	public void destroy()
	{
		System.out.println("Destroy");
	}
}