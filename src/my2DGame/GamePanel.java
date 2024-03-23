package my2DGame;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel{  // we extend from the class JPanel so that we can add Content.
										//so then we use a bit of math 
	final int defaultTileSize = 16;		//so then we add a tile of size 16.	
	final int scale = 3;                //to which is scaled 3 times.
	
	final int tileSize = defaultTileSize * scale;  // then we multiply defaultTileSize and scale, to add in total 48 tiles to the panel
	final int maxScreenCol = 16;
	final int maxScreenRow = 12;
	final int screenWidth = maxScreenCol * tileSize;
	final int screenHeight = maxScreenRow * tileSize;
																	
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		
		
	}

}
