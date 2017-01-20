

import java.awt.*;

public class backgroundmounts
{
   private int xstart;     // center of figure
   private int ystart;
   private Color backmountains = new Color(43, 17, 5);   // color of back mountains
   private Color frontmountains = new Color(61, 23, 7); //color of front mountains
   private int height;    // height of stick figure
   
   
   

   //-----------------------------------------------------------------
   //  Sets up the stick figure's primary attributes.
   //-----------------------------------------------------------------
   public backgroundmounts (int placex, int placey, int h1)
   {
       xstart = placex;
       ystart = placey;
       height = h1;
   }

   //-----------------------------------------------------------------
   //  Draws the mountains
   //-----------------------------------------------------------------
   public void draw (Graphics page)
   {  
      
       int xpoints[] = {xstart,xstart+350, xstart+700};
       int ypoints[] = {ystart+400, height, ystart+400};
       int npoints = 3;
       Graphics2D g2 = (Graphics2D) page;
       GradientPaint mountcolor = 
           new GradientPaint(0, 0, backmountains, 
                             0, 400, frontmountains, true);
       g2.setPaint(mountcolor);
       page.fillPolygon(xpoints, ypoints, npoints);
       
       
       
       //g2.setPaint(bggradient);
       //Rectangle backgroundrec = new Rectangle(0,0,700,400);
       //g2.fill(backgroundrec);

   }
}
