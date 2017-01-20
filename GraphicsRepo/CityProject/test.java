//********************************************************************
//  LineUp.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a graphical object.
//********************************************************************

import java.util.*;
import java.util.Random;
import java.applet.Applet;
import java.awt.*;


public class test extends Applet
{
   /*///////////////////
   Applet Variables
   *////////////////////
   private final int APPLET_WIDTH = 770;
   private final int APPLET_HEIGHT = 500;

   
   /*///////////////////
   Mountain Variables
   *////////////////////
   
   private final int VARIANCE = 100;
   private final Color skycolor2 = new Color(139, 72, 69);
   private final Color skycolor = new Color(85, 99, 138);
   //(85, 99, 138);
   //(90, 85, 138);
   private backgroundmounts mountain1, mountain2, mountain3;
   private forwardmounts mountain4, mountain5;
   private onepartbuildings building5, building6, building7, building8, building9, building10, building12, building13;
   private water ocean;
   

   //-----------------------------------------------------------------
   //  Creates several mountains with varying characteristics.
   //-----------------------------------------------------------------
   public void init ()
   {

      /*///////////////////
      Mountain Properties
      *////////////////////
      int h1, h2, h3, h4, h5;
      Random generator = new Random();
      h1 = generator.nextInt(VARIANCE);
      h2 = generator.nextInt(VARIANCE);
      h3 = generator.nextInt(VARIANCE);
      h4 = generator.nextInt(VARIANCE);
      h5 = generator.nextInt(VARIANCE);
      mountain1 = new backgroundmounts (-300, 150, h1);
      mountain2 = new backgroundmounts (0, 150, h2);
      mountain3 = new backgroundmounts (300, 150, h3);
      mountain4 = new forwardmounts(200, 150, h4);
      mountain5 = new forwardmounts(-200, 150, h5);
      
      /*///////////////////
      Building Properties
      *////////////////////
      int b13, b12, b8, b9, b10, b7, b5, b6;
      b13 = 100+ generator.nextInt(75);
      b12 = 100+ generator.nextInt(100);
      b8 = 100+ generator.nextInt(100);
      b9 = 100+ generator.nextInt(100);
      b10 = 100+ generator.nextInt(100);
      b7 = 100+ generator.nextInt(100);
      b5 = 100+generator.nextInt(100);
      b6 = 100+generator.nextInt(100);
      
      Color backbuilds = new Color (72, 72, 72);
      building13 = new onepartbuildings (520, b13, 100, 400-b13, backbuilds);
      building12 = new onepartbuildings (250, b12, 100, 400-b12, backbuilds);
      //building 11a/b
      Color midbuilds = new Color (100, 100, 100);
      building8 = new onepartbuildings (150, b8+50, 100, 400-b8, midbuilds);
      building9 = new onepartbuildings (380, b9+100, 100, 400-b9, midbuilds);
      building10 = new onepartbuildings (600, b10, 100, 400-b10, midbuilds);
      
      Color frontbuilds = new Color (150, 150, 150);
      building7 = new onepartbuildings(70, b7, 100, 400-b7, frontbuilds);
      building5 = new onepartbuildings(500, b5+100, 100, 400-b5, frontbuilds);
      building6 = new onepartbuildings(320, b6, 100, 400-b6, frontbuilds);
      
      /*///////////////////
      Cityscape Properties
      *////////////////////
      Color wc1 = new Color (0, 51, 102);
      Color wc2 = new Color (0, 76, 153);
      ocean = new water(0, 400, 770, 100, wc1, wc2);
      
      
      /*///////////////////
      Cityscape Properties
      *////////////////////

      setBackground (skycolor);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   //-----------------------------------------------------------------
   //  Paints the stick figures on the applet.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {
       Graphics2D g2 = (Graphics2D) page;
       GradientPaint bggradient = 
           new GradientPaint(0, 0, skycolor, 
                             0, 400, skycolor2, true);
       g2.setPaint(bggradient);
       Rectangle backgroundrec = new Rectangle(0,0,770,400);
       g2.fill(backgroundrec);
       
       
       
      /*///////////////////
      Mountain Paint
      *////////////////////
      mountain1.draw(page);
      mountain2.draw(page);
      mountain3.draw(page);
      mountain4.draw(page);
      mountain5.draw(page);
      
      
      building13.draw(page);
      building12.draw(page);
      //building11.draw(page);
      building8.draw(page);
      building9.draw(page);
      building10.draw(page);
      //building6.draw(page);
      building5.draw(page);
      building7.draw(page);
      building6.draw(page);
      
      ocean.draw(page);
      
      
      

   }
}
