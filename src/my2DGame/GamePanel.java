package my2DGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{  // we extend from the class JPanel so that we can add Content.
										//so then we use a bit of math 
	final int defaultTileSize = 16;		//so then we add a tile of size 16 x 16
	final int scale = 3;                //to which is scaled by 3.
	
	final int tileSize = defaultTileSize * scale;  // then we multiply defaultTileSize and scale, to add in total 48 tiles to the panel
	final int maxScreenCol = 16;					// then we add 16 of these 48 tiles in collons 
	final int maxScreenRow = 12;                  // then we add 12 of these 48 tiles in rows
	final int screenWidth = maxScreenCol * tileSize;   
	final int screenHeight = maxScreenRow * tileSize;
	
	int FPS = 60;
	
	KeyHandler keyH = new KeyHandler();
	Thread gameThread;
	
	
	int playerX = 100;
	int playerY = 100;
	int playerSpeed = 4;
	
																	
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.BLACK);
		this.setDoubleBuffered(true);
		this.addKeyListener(keyH);
		this.setFocusable(true);
		
		
	}
	
	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.start();
	}


	@Override
	public void run() {
		
		double drawInterval = 1000000000/FPS;
		double nextDrawTime = System.nanoTime() + drawInterval;
		
		while(gameThread !=  null) {
			
			
			
		
			// 1 Update: update information like Character Posision
			update();
		
		// 2 Draw: Draw the screen with the update information.
			repaint();
		
		
			try {	
				double remainingTime = nextDrawTime - System.nanoTime();
		        remainingTime = remainingTime/1000000;	
				
		        if(remainingTime < 0) {
				remainingTime = 0;
				}
		
				
		
				  Thread.sleep((long) remainingTime);
					
				  nextDrawTime += drawInterval;
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		
		
		
}
	
		public void update() {
			
			if(keyH.upPressed) {
			 playerY -= playerSpeed;
		 
			}
			else if(keyH.downPressed) {
				playerY += playerSpeed;
			
			}
			
			else if (keyH.leftPressed) {
				playerX -= playerSpeed;

		}
			else if (keyH.rightPressed) {
				playerX += playerSpeed;
		}
		
	}
	
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		
		
		g2.setColor(Color.GREEN);
		
		g2.fillRect(playerX, playerY, tileSize, tileSize);
		
		g2.dispose();
	}
		

}
