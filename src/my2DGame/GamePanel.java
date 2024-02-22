package my2DGame;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	final int defaultTileSize = 16;
	final int scale = 3;
	
	final int tileSize = defaultTileSize * scale;
	final int maxScreenCol = 16;
	final int maxScreenRow = 11;
	final int screenWidth = maxScreenCol * tileSize;
	final int screenHeight = maxScreenRow * tileSize;
	

}
