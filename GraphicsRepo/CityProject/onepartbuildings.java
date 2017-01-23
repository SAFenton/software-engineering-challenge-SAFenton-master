import java.util.*;
import java.util.Random;
import java.applet.Applet;
import java.awt.*;

public class onepartbuildings
{
   /*///////////////////
   Building Variables
   *////////////////////
   private int x, y, w, h;
   private Color c, wc;

   public onepartbuildings (int posx, int posy, int width, int height, Color color)
   {
       x = posx;
       y = posy;
       w = width;
       h = height;
       c = color;
   }

   public void draw (Graphics page)
   {  
       page.setColor(c);
       page.fillRect(x, y, w, h);

       /*///////////////////
       Windows
       *////////////////////
       Color wc = new Color (255,255,102);
       int num = h/15;
       int wx = x + 8; //window x position
       int wy = y+8; //window y position
       int ww = 10; //window width
       int wh = 10; //window height  
       for (int column = 0; column < num; column++)
       {
    		for (int row = 0; row< 6; row++)
    		{
    			wx = wx; 
    			page.setColor(wc);
       			page.fillRect(wx, wy, ww, wh);
    			wx = wx+15;
            }
    		wy = wy + 15;
    		wx = x + 8;
    		if (wy >380)
    			{
    				column = num;
       			}
       }
   }
}
