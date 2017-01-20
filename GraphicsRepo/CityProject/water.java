import java.util.*;
import java.util.Random;
import java.applet.Applet;
import java.awt.*;


public class water
{
   private int x, y, w, h;
   private Color c1, c2;
   
   
   

   //-----------------------------------------------------------------
   //  Sets up the stick figure's primary attributes.
   //-----------------------------------------------------------------
   public water (int posx, int posy, int width, int height, Color color, Color color2)
   {
       x = posx;
       y = posy;
       w = width;
       h = height;
       c1 = color;
       c2 = color2;
   }

   //-----------------------------------------------------------------
   //  Draws the mountains
   //-----------------------------------------------------------------
   public void draw (Graphics page)
   {  
      
       Graphics2D g2 = (Graphics2D) page;
       GradientPaint mountcolor = new GradientPaint(0, 400, c2, 0, 500, c1, true);
       g2.setPaint(mountcolor);
       //page.setColor(c1);
       page.fillRect(x, y, w, h);
       


   }
}
