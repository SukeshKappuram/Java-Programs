	//  Example for CardLayout

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="App6" width=500 height=500>
</applet>
*/

public class App6 extends Applet implements ActionListener,MouseListener
 {
         Button b1,b2;
         Panel cou,lng,sht;
         Checkbox cb1,cb2,cb3,cb4,cb5,cb6,cb7;
         CardLayout card;

         public void init()
          {
	cb1=new Checkbox("Dca");
	cb2=new Checkbox("C");
	cb3=new Checkbox("CPP");
	cb4=new Checkbox("Java");
	cb5=new Checkbox("MultiMedia");
	cb6=new Checkbox("Dact");
	cb7=new Checkbox("PgDca");

	b1=new Button("Long Courses");
	b2=new Button("Short Courses");

	sht=new Panel();
	sht.setBackground(Color.pink);
	sht.add(cb1);    sht.add(cb2);   sht.add(cb3);

	lng=new Panel();
	lng.setBackground(Color.orange);
	lng.add(cb4);       lng.add(cb5);    lng.add(cb6);    lng.add(cb7);

	card=new CardLayout();
	cou=new Panel();
	cou.setLayout(card);
	cou.add(sht,"Short");
	cou.add(lng,"Long");

	add(b1);    add(b2);    add(cou);

	b1.addActionListener(this);
	b2.addActionListener(this);
	addMouseListener(this);
          }

        public void actionPerformed(ActionEvent ae)
         {
	if(ae.getActionCommand().equals("Long Courses"))
	         card.show(cou,"Long");
	else
	        card.show(cou,"Short");
         }

       public void mouseEntered(MouseEvent me) {   }
       public void mouseExited(MouseEvent me) {   }
       public void mousePressed(MouseEvent me) {   }
       public void mouseReleased(MouseEvent me) {   }
       public void mouseClicked(MouseEvent me)
        {
	card.next(cou);
        }
 }