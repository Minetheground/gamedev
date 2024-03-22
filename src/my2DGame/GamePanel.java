package my2DGame;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	final int defaultTileSize = 16;
	final int scale = 3;
	
	final int tileSize = defaultTileSize * scale;
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
