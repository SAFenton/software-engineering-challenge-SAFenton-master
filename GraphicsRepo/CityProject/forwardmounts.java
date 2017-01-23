import java.awt.*;

public class forwardmounts
{
   /*///////////////////
   Mountain variables
   *////////////////////
   private int xstart;
   private int ystart;
   private Color frontmountains = new Color(61, 23, 7);
   private int height;


   public forwardmounts (int placex, int placey, int h1)
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
       page.setColor(frontmountains);
       page.fillPolygon(xpoints, ypoints, npoints);

   }
}
