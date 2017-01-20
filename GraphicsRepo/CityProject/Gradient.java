// Gradient.java
import java.applet.Applet;
import java.awt.*;
import java.awt.geom.*;

public class Gradient extends Applet 
{
    private final Color skycolor = new Color(17, 32, 92);
   private final Color skycolor2 = new Color(0, 0, 0);
   public void paint(Graphics gc) 
   {
       int min_x = 0;   int min_y = 0;
       int max_x = 200; int max_y = 200;
       Graphics2D g2 = (Graphics2D) gc;
       GradientPaint bggradient = 
           new GradientPaint(min_x, min_y, skycolor, 
                             max_x, max_y, skycolor2, false);
       g2.setPaint(bggradient);
       Rectangle backgroundrec = new Rectangle(min_x,min_y,max_x,max_y);
       g2.fill(backgroundrec);
       
       //g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
               //RenderingHints.VALUE_ANTIALIAS_ON);
       
       
   } 
   
}