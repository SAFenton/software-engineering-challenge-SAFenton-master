import java.util.*;
import java.util.Random;
import java.applet.Applet;
import java.awt.*;


public class onepartbuildings
{
   private int x, y, w, h;
   private Color c;
   
   
   

   //-----------------------------------------------------------------
   //  Sets up the stick figure's primary attributes.
   //-----------------------------------------------------------------
   public onepartbuildings (int posx, int posy, int width, int height, Color color)
   {
       x = posx;
       y = posy;
       w = width;
       h = height;
       c = color;
       
      
       int num = h/25;
       
       /*
       windows[] allwindows = new windows[25*num];
      
      for (windows i: allwindows)
      {
          widnows awindow = new CircleComponent();
          i = acircle;
          
          frame.add(i);
          frame.setVisible(true);
        }
        
        */
   }

   //-----------------------------------------------------------------
   //  Draws the mountains
   //-----------------------------------------------------------------
   public void draw (Graphics page)
   {  
      
       
       page.setColor(c);
       page.fillRect(x, y, w, h);
       
       
       
       
       
       
       
       
       //g2.setPaint(bggradient);
       //Rectangle backgroundrec = new Rectangle(0,0,700,400);
       //g2.fill(backgroundrec);

   }
}
