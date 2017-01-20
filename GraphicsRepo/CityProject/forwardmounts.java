

import java.awt.*;

public class forwardmounts
{
   private int xstart;     // center of figure
   private int ystart;
   private Color frontmountains = new Color(61, 23, 7); //color of front mountains
   private int height;    // height of stick figure

   //-----------------------------------------------------------------
   //  Sets up the stick figure's primary attributes.
   //-----------------------------------------------------------------
   public forwardmounts (int placex, int placey, int h1)
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
       page.setColor(frontmountains);
       page.fillPolygon(xpoints, ypoints, npoints);

   }
}
