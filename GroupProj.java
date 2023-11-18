import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.geom.Line2D;

public class GroupProj extends JFrame {
    private static final long serialVersionUID = 1L;
 public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GroupProj();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public GroupProj() {
        setSize(new Dimension(2000, 2000));
        setTitle("SKY");
        getContentPane().setBackground(new Color(19,24,98));
        setVisible(true);
    }
     public void paint (Graphics g)
    {
        super.paint(g);

// Clouds & mountain
        g.setColor(new Color(255,255,255));//cloudssss
        g.fillOval(140,50,70,50);
        g.fillOval(85,70,70,50);
        g.fillOval(170,60,140,100);
        g.fillOval(110,80,140,100); 
        g.fillOval(230,110,120,70);//cloud1 
        g.fillOval(540,150,70,50);
        g.fillOval(485,170,70,50);
        g.fillOval(570,160,140,100);
        g.fillOval(510,180,140,100); 
        g.fillOval(630,210,120,70);//cloud2
        g.fillOval(940,80,70,50);
        g.fillOval(885,100,70,50);
        g.fillOval(970,90,140,100);
        g.fillOval(910,110,140,100);
        g.fillOval(1030,140,120,70);//cloud3
        
        g.fillOval(1340,180,70,50); 
        g.fillOval(1285,200,70,50);
        g.fillOval(1370,190,140,100);
        g.fillOval(1310,210,140,100);
        g.fillOval(1430,240,120,70);
        
        // Stars in the sky --> My Part (Swetha) 
    g.setColor(Color.WHITE);
        
    for (int i=0; i<500; i=i+1)
    {
      int starX = (int)(2000*Math.random());
      int starY = (int)(400*Math.random());
      int starD = (int)(7*Math.random()+1);
            
      g.fillOval(starX, starY, starD, starD);
    }
    
    // End of Stars in the sky --> My Part (Swetha)
    
        g.setColor (new Color(252,218,154));//MOUNTAIN1
        int[] xCoordinates2 = {800,1200,1800};
        int[] yCoordinates2 = {500,300,500};
        g.fillPolygon(xCoordinates2,yCoordinates2,3);
        int[] xCoordinates6 = {0,900,1400};
        int[] yCoordinates6 = {500,280,500};
        g.fillPolygon(xCoordinates6,yCoordinates6,3);
        int[] xCoordinates4 = {-200,200,800};
        int[] yCoordinates4 = {500,300,500};
        g.fillPolygon(xCoordinates4,yCoordinates4,3);
        int[] xCoordinates5 = {-200,500,800};
        int[] yCoordinates5 = {500,300,500};
        g.fillPolygon(xCoordinates5,yCoordinates5,3);

        
        int[] xCoordinates12 = {600,1500,2200}; //addition for big screen user
        int[] yCoordinates12 = {500,300,500};
        g.fillPolygon(xCoordinates12,yCoordinates12,3);
        
        g.setColor (new Color(240,170,100));//MOUNTAIN2
        int[] xCoordinates3 = {100,600,1000};
        int[] yCoordinates3 = {500,300,500};
        g.fillPolygon(xCoordinates3,yCoordinates3,3);
        int[] xCoordinates7 = {400,900,1900};
        int[] yCoordinates7 = {500,320,500};
        g.fillPolygon(xCoordinates7,yCoordinates7,3);
        int[] xCoordinates8 = {600,1300,1900};
        int[] yCoordinates8 = {500,320,500};
        g.fillPolygon(xCoordinates8,yCoordinates8,3);
       // sebrina
        int[] xCoordinates13 = {910,1800,1900}; //addition for big screen user
        int[] yCoordinates13 = {500,320,500};
        g.fillPolygon(xCoordinates13,yCoordinates13,3);
        
        g.setColor (new Color(222,134,71));//MOUNTAIN3
        int[] xCoordinates1 = {0, 400,600};
        int[] yCoordinates1 = {500,400,500};
        g.fillPolygon(xCoordinates1,yCoordinates1,3);
        int[] xCoordinates9 = {200,700,900};
        int[] yCoordinates9 = {500,400,500};
        g.fillPolygon(xCoordinates9,yCoordinates9,3);
        int[] xCoordinates10 = {-200,100,300};
        int[] yCoordinates10 = {500,400,500};
        g.fillPolygon(xCoordinates10,yCoordinates10,3);
        int[] xCoordinates11 = {1100,1300,1900};
        int[] yCoordinates11 = {500,400,500};
        g.fillPolygon(xCoordinates11,yCoordinates11,3);
    
        
        g.setColor (new Color(151, 190, 73 ));  /*Green Option: //136, 205, 73 //160, 205, 73       //151, 205, 73 //172, 202, 20 */
        g.fillRect (0,500,2000,800);
        
        //trees
        g.setColor(new Color(74, 102, 14)); //tree1 (small tree beside house 1) 
        int[] xCoordinates001 = {150,170,190};
        int[] yCoordinates001 = {500,400,500};
        g.fillPolygon(xCoordinates001,yCoordinates001,3); 
        g.setColor(new Color(80, 38, 14)); //trunk colour 
        g.fillRect (165,500,10,25);
        
        g.setColor (new Color(74,102,14)); //tree 2 
        int[] xCoordinates002 = {25,45,65};
        int[] yCoordinates002 = {520,420,520};
        g.fillPolygon(xCoordinates002,yCoordinates002,3);
        g.setColor(new Color (80,38,14));
        g.fillRect (40,520,10,14);
        
        g.setColor(new Color(74,102,14)); //tree 3 (big tree near house 1)
        int[] xCoordinates003 = {30,100,170};
        int[] yCoordinates003 = {640,420,640};
        g.fillPolygon(xCoordinates003,yCoordinates003,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (87,640,20,40);
        
        g.setColor(new Color(74,102,14)); //tree 4 
        int[] xCoordinates004 = {-70,10,90};
        int[] yCoordinates004 = {860,640,860};
        g.fillPolygon(xCoordinates004,yCoordinates004,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (5,860,20,60);
        
        g.setColor(new Color(74,102,14)); //tree 5 
        int[] xCoordinates005 = {1630,1650,1670};
        int[] yCoordinates005 = {510,385,510};
        g.fillPolygon(xCoordinates005,yCoordinates005,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (1645,510,10,14);
        
        g.setColor(new Color(74,102,14)); //tree 6 
        int[] xCoordinates006 = {1550,1570,1590};
        int[] yCoordinates006 = {500,370,500};
        g.fillPolygon(xCoordinates006,yCoordinates006,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (1565,500,10,14);
        
        g.setColor(new Color(74,102,14)); //tree 7
        int[] xCoordinates007 = {1670,1690,1710};
        int[] yCoordinates007 = {540,430,540};
        g.fillPolygon(xCoordinates007,yCoordinates007,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (1685,540,10,14);
        
        g.setColor(new Color(74,102,14)); //tree 8
        int[] xCoordinates008 = {1440,1460,1480};
        int[] yCoordinates008 = {520,410,520};
        g.fillPolygon(xCoordinates008,yCoordinates008,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (1455,520,10,14); 
        
        g.setColor(new Color(74,102,14)); //tree 9
        int[] xCoordinates009 = {1475,1495,1515};
        int[] yCoordinates009 = {507,400,507};
        g.fillPolygon(xCoordinates009,yCoordinates009,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (1490,507,10,14);
        
        g.setColor(new Color(74,102,14)); //tree 10
        int[] xCoordinates010 = {1510,1530,1550};
        int[] yCoordinates010 = {530,400,530};
        g.fillPolygon(xCoordinates010,yCoordinates010,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (1525,530,10,14);
        
        g.setColor(new Color(74,102,14)); //tree 11
        int[] xCoordinates011 = {1565,1615,1665};
        int[] yCoordinates011 = {600,400,600};
        g.fillPolygon(xCoordinates011,yCoordinates011,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (1605,600,20,20);
        
        g.setColor(new Color(74,102,14)); //tree 12
        int[] xCoordinates012 = {1360,1405,1450};
        int[] yCoordinates012 = {545,400,545};
        g.fillPolygon(xCoordinates012,yCoordinates012,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (1400,545,20,20);
        
        g.setColor(new Color(74,102,14)); //tree 13
        int[] xCoordinates013 = {1425,1475,1525};
        int[] yCoordinates013 = {600,450,600};
        g.fillPolygon(xCoordinates013,yCoordinates013,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (1465,600,20,20);
        
        g.setColor(new Color(74,102,14)); //tree 14
        int[] xCoordinates014 = {1487,1547,1607};
        int[] yCoordinates014 = {684,535,684};
        g.fillPolygon(xCoordinates014,yCoordinates014,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (1537,684,20,20);
        
        g.setColor(new Color(74,102,14)); //tree 15
        int[] xCoordinates015 = {1625,1675,1725};
        int[] yCoordinates015 = {684,535,684};
        g.fillPolygon(xCoordinates015,yCoordinates015,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (1667,684,20,20);
        
        g.setColor(new Color(74,102,14)); //tree 16 behind the house 1 
        int[] xCoordinates016 = {545,565,585};
        int[] yCoordinates016 = {500,400,500};
        g.fillPolygon(xCoordinates016,yCoordinates016,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (560,500,10,14);
        
        g.setColor(new Color(74,102,14)); //tree 17
        int[] xCoordinates017 = {1288,1308,1328};
        int[] yCoordinates017 = {500,400,500};
        g.fillPolygon(xCoordinates017,yCoordinates017,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (1302,500,10,14);
        
        g.setColor(new Color(74,102,14)); //tree 18
        int[] xCoordinates018 = {1188,1208,1228};
        int[] yCoordinates018 = {500,400,500};
        g.fillPolygon(xCoordinates018,yCoordinates018,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (1202,500,10,14);
        
        g.setColor(new Color(74,102,14)); //tree 19
        int[] xCoordinates019 = {1205,1265,1325};
        int[] yCoordinates019 = {555,390,555};
        g.fillPolygon(xCoordinates019,yCoordinates019,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (1255,555,20,20);
        
        g.setColor(new Color(74,102,14)); //tree 20
        int[] xCoordinates020 = {1285,1345,1405};
        int[] yCoordinates020 = {600,420,600};
        g.fillPolygon(xCoordinates020,yCoordinates020,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (1340,600,20,20);
        
        g.setColor(new Color(74,102,14)); //tree 21
        int[] xCoordinates021 = {1365,1415,1465};
        int[] yCoordinates021 = {700,555,700};
        g.fillPolygon(xCoordinates021,yCoordinates021,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (1405,700,20,20);
        
        g.setColor(new Color(74,102,14)); //tree 22
        int[] xCoordinates022 = {1420,1470,1520};
        int[] yCoordinates022 = {750,600,750};
        g.fillPolygon(xCoordinates022,yCoordinates022,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (1460,750,20,30);
        
        g.setColor(new Color(74,102,14)); //tree 23
        int[] xCoordinates023 = {1560,1610,1660};
        int[] yCoordinates023 = {760,600,760};
        g.fillPolygon(xCoordinates023,yCoordinates023,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (1600,760,20,30);
        
        g.setColor(new Color(74,102,14)); //tree 24
        int[] xCoordinates024 = {1677,1727,1777};
        int[] yCoordinates024 = {750,600,750};
        g.fillPolygon(xCoordinates024,yCoordinates024,3);
        g.setColor (new Color (80,38,14));
        g.fillRect (1717,750,20,20);

// START HOUSE 1 OVERALL 
        
        // House 1--> My Part (Swetha)
        Graphics2D l = (Graphics2D) g;// help to bold the rectangle border line
        l.setStroke(new BasicStroke(2));
        g.setColor(new Color(0,0,0));
        g.drawRect(200,370,225,220);
        g.drawRect(426,440,130,150);
        g.setColor(Color.white);
        g.fillRect(200,370,225,220);
        g.fillRect(426,440,130,150);
        
        //roof --> My Part (Swetha) 
        g.setColor(new Color(153, 0, 0));// color of the roof 
        int[] xCoordinates01 = {160, 313,470};
        int[] yCoordinates01 = {379,290,379};
        g.fillPolygon(xCoordinates01,yCoordinates01,3);// roof of the house 
        g.setColor(Color.black);
        g.drawPolygon(xCoordinates01,yCoordinates01,3);// roof of the house 
        g.setColor(new Color(153, 0, 0)); // color of the roof 
        int[] xCoordinates02 = {426, 426,576};// x coordinates roof of the first house 
        int[] yCoordinates02 = {439,395,439}; // y coordinates of the first house roof 
        g.fillPolygon(xCoordinates02,yCoordinates02,3);
        g.setColor(Color.black);// border color of the second roof 
        g.drawPolygon(xCoordinates02,yCoordinates02,3);// outline black of the second roof 
        
        // door of the house --> My Part (Swetha) 
        l.setStroke(new BasicStroke(3));
        g.drawRect(285,499,55,90);// door
        g.setColor(Color.red);// door color 
        g.fillRect(285,500,55,90); // to fill the door color 
        g.setColor(Color.yellow); 
        g.fillArc(284,470,57,57,0,180);
        g.setColor( Color.black);
        l.setStroke(new BasicStroke(2));
        g.drawArc(284,470,57,57,0,180);
        g.drawLine(284,498,340,498);// line between the door and the semicircle
        g.drawLine(295,477,313,498);// pattern on top of the door 
        g.drawLine(330,477,313,498);// pattern on top of the door 
        g.fillOval(332,533,6,10); // color for the door handle 
        g.drawOval(332,533,6,10);// for the door handle 
        
        // windows for side house --> My Part (Swetha) 
        g.setColor(Color.yellow);
        g.fillRect(465,490,50,50);
        g.setColor(Color.black);
        g.drawRect(465,490,50,50);
        g.drawLine(490,490,490,538);
        g.drawLine(465,515,515,515);
        
        // START HOUSE 2 OVERALL 
        
        // House 2 --> My Part (Swetha)
        l.setStroke(new BasicStroke(1));
        g.setColor(new Color(0,0,0));
        g.drawRect(890,395,145,125);
        g.drawRect(1036,440,70,80);
        g.setColor(Color.white);
        g.fillRect(890,395,145,125);
        g.fillRect(1036,440,70,80);
        
        // house 2 roof --> My Part (Swetha)
        g.setColor(new Color (0,0,153));// color of the roof 
        int[] xCoordinates0002 = {878, 960,1050};
        int[] yCoordinates0002 = {395,350,395};
        g.fillPolygon(xCoordinates0002,yCoordinates0002,3);// roof of the house 
        g.setColor(Color.black);// border line 
        g.drawPolygon(xCoordinates0002,yCoordinates0002,3);// roof of the house 
        g.setColor(new Color (0,0,153)); // color of the roof 
        int[] xCoordinates0003 = {1036, 1036,1118};// x coordinates roof of the first house 
        int[] yCoordinates0003 = {439,405,439}; // y coordinates of the first house roof 
        g.fillPolygon(xCoordinates0003,yCoordinates0003,3);
        g.setColor(Color.black);// border color of the second roof 
        g.drawPolygon(xCoordinates0003,yCoordinates0003,3);// outline black of the second roof

        g.setColor (Color.yellow);
        g.fillRect (900,405,35,35);
        g.setColor (Color.black);
        g.drawRect (900,405,35,35);
        g.drawLine (917,405,917,440); //vertical line 
        g.drawLine (900,422,935,422);//horizontal line 
        g.setColor (Color.yellow); // window 2
        g.fillRect (900,460,35,35);
        g.setColor (Color.black);
        g.drawRect (900,460,35,35);
        g.drawLine (917,460,917,495); //vertical line 
        g.drawLine (900,477,935,477); //horizontal line 
        g.setColor (Color.yellow); // window 3
        g.fillRect (945,405,35,35);
        g.setColor (Color.black);
        g.drawRect (945,405,35,35);
        g.drawLine (962,405,962,440); //vertical line 
        g.drawLine (945,422,980,422);//horizontal line 
        g.setColor (Color.yellow); // window 4
        g.fillRect (990,405,35,35);
        g.setColor (Color.black);
        g.drawRect (990,405,35,35);
        g.drawLine (1007,405,1007,440); //vertical line 
        g.drawLine (990,422,1025,422);//horizontal line
        g.setColor (Color.yellow); // window 5
        g.fillRect (990,460,35,35);
        g.setColor (Color.black);
        g.drawRect (990,460,35,35);
        g.drawLine (1007,460,1007,495); //vertical line 
        g.drawLine (990,477,1025,477);//horizontal line

        // door house 2 --> My Part (Swetha)
        l.setStroke ( new BasicStroke (1)) ;
        g.setColor(new Color(51,51,255));// color for door 
        g.fillRect (945,465,35,55); // coordinates for the door
        g.setColor (Color.black); // border door color  
        g.drawRect ( 945,465,35,55) ; 
        g.setColor(new Color(255,255,115)); // dull yellow color for the light in the distance 
        g.fillArc ( 945,447,35,35,0,180) ;
        g.setColor (Color.black) ;
        l.setStroke(new BasicStroke (2)) ;
        g.drawArc (945,447,35,35,0 ,180 ) ;
        g.fillOval(973,490,4,8);// door knob 
        g.drawOval(973,490,4,8);// door knob 
        g.drawLine(953,452,963, 465);// pattern on top of the door 
        g.drawLine(973,450,963,465);// pattern on top of the door 

        l.setStroke(new BasicStroke (1));
        g.setColor( new Color (255,255,115));
        g.fillRect(1055,460,35,35);
        g.setColor(Color.black);
        g.drawRect(1055,460,35,35);
        g.drawLine(1073,495,1073,460);
        g.drawLine(1055,478,1090,478);

        g.setColor(Color.yellow);// windows for main house
        g.fillRect(220,490,50,50);
        g.setColor(Color.black);
        g.drawRect(220,490,50,50);
        g.drawLine(245,490,245,538);
        g.drawLine(220,515,270,515);

        g.setColor(Color.yellow);// windows for main house
        g.fillRect(220,400,50,50);
        g.setColor(Color.black);
        g.drawRect(220,400,50,50);
        g.drawLine(245,400,245,448);
        g.drawLine(220,425,270,425);
        
        g.setColor(Color.yellow);
        g.fillRect(287,400,50,50);
        g.setColor(Color.black);
        g.drawRect(287,400,50,50);
        g.drawLine(312,400,312,448);
        g.drawLine(287,425,337,425);
        
        g.setColor(Color.yellow);
        g.fillRect(355,400,50,50);
        g.setColor(Color.black);
        g.drawRect(355,400,50,50);
        g.drawLine(380,400,380,448);
        g.drawLine(355,425,405,425);
        
        g.setColor(Color.yellow);
        g.fillRect(355,490,50,50);
        g.setColor(Color.black);
        g.drawRect(355,490,50,50);
        g.drawLine(380,490,380,538);
        g.drawLine(355,515,405,515);
        
        g.setColor(new Color(169,169,169));
        g.fillOval(1200,60,100,100);//First circle, same color as the background
        g.setColor(new Color(19,24,98));//Color of the second circle
        g.fillOval(1190,50,100,100);//Second circle being overlapped by the first circle
         
        g.setColor(Color.black);
        g.fillRect(440,650,5,70);
        g.fillRect(420,630,50,20);
        g.fillOval(450,630,25,20);
        g.setColor(Color.red);
        g.fillRect(460,620,3,18);
        g.fillRect(460,620,10,6);
        
         g.setColor(Color.black);
        g.fillRect(1040,550,5,70);
        g.fillRect(1020,530,50,20);
        g.fillOval(1050,530,25,20);
        g.setColor(Color.red);
        g.fillRect(1060,520,3,18);
        g.fillRect(1060,520,10,6);

        g.setColor(new Color(128,128,128));
        g.fillOval(275,600,40,20);
        g.fillOval(230,630,45,20);
        g.fillOval(200,660,50,18);
        g.fillOval(220,690,70,25);
        g.fillOval(280,660,60,25);
        g.fillOval(220,735,110,40); 

        g.setColor(new Color(128,128,128));
        g.fillOval(940,535,40,25);
        g.fillOval(895,560,45,30);
        g.fillOval(965,590,50,25);
        g.fillOval(885,620,70,25);
        g.fillOval(945,650,60,25);
        g.fillOval(885,680,110,40);

    }
}
