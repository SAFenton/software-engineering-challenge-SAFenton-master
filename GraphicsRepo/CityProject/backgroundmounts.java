import java.awt.*;

public class backgroundmounts
{
   /*///////////////////
   Mountain variables
   *////////////////////
   private int xstart;
   private int ystart;
   private Color backmountains = new Color(43, 17, 5);
   private Color frontmountains = new Color(61, 23, 7);
   private int height;

   public backgroundmounts (int placex, int placey, int h1)
   {
       xstart = placex;
       ystart = placey;
       height = h1;
   }

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
   }
}
